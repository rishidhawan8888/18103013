package javaapplication2;



import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.*;

import static javaapplication2.JavaApplication2.Test.isValid;

public class JavaApplication2 {

    public static void main(String[] args) throws IOException {
        Set<String> done = new HashSet<>();
        Queue<String> remaining = new PriorityQueue<>();
        System.out.println("Enter link of base website");
        String input;
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        remaining.add(input);
        XSSFWorkbook book = new XSSFWorkbook();
        XSSFSheet sheettext = book.createSheet("Text");
        XSSFSheet sheettag = book.createSheet("Tags");
        XSSFSheet sheetFaculty = book.createSheet("Faculty Info");
        XSSFRow row;
        
        Map<String, Object[]> Infoobtained = new TreeMap<>();
        Infoobtained.put("1", new Object[]{"Link", "Tag"});
        
        int sn = 2;
        int sheettextRow = 0;
        int sheetFacultyRow = 0;
        while (remaining.size() != 0 && done.size() < 1) {
            System.out.println("Processing...");
            input = remaining.poll();
            if (!isValid(input) || !input.contains("pec.ac.in"))
                continue;
            Document doc;
            Elements links;
            String text;
            try {
                doc = Jsoup.connect(input).get();
                links = doc.select("a[href]");
            } catch (Exception e) {
                continue;
            }
            System.out.println(links.size());
            for (Element link : links) {
                String newu = "";

                if (!isValid(link.attr("href"))) {
                    newu = "https://pec.ac.in/" + link.attr("href");
                    if (!isValid(newu)) continue;
                }
                System.out.println(newu);
                remaining.add(newu);
                Infoobtained.put(Integer.toString(sn++), new Object[]{newu, link.text()});
                try {
                    text = Jsoup.connect(newu).get().body().text();
                    row = sheettext.createRow(sheettextRow++);
                    Cell cell = row.createCell(0);
                    cell.setCellValue(newu);
                    cell = row.createCell(1);
                    cell.setCellValue(text);
                } catch (Exception e) {
                    System.out.println("not a valid url");
                }

                if (link.toString().contains("faculty")) {
                    try {
                        Document faculty = Jsoup.connect(newu).get();
                        String facultyInfo = faculty.getElementsByClass("panel-body").not("col-md-10").text();
                        row = sheetFaculty.createRow(sheetFacultyRow++);
                        Cell cell = row.createCell(0);
                        cell.setCellValue(link.attr("href").replace("faculty", ""));
                        row = sheetFaculty.createRow(sheetFacultyRow++);
                        cell = row.createCell(1);
                        cell.setCellValue(facultyInfo);
                        sheetFacultyRow++;
                    } catch (Exception e) {
                        System.out.println("not valid url");
                    }
                }
            }
            done.add(input);
            System.out.println(done.size());

        }
        Set<String> keyid = Infoobtained.keySet();
        int rowid = 0;
        for (String key : keyid) {
            row = sheettag.createRow(rowid++);
            Object[] objectArr = Infoobtained.get(key);
            int cellid = 0;

            for (Object obj : objectArr) {
                Cell cell = row.createCell(cellid++);
                cell.setCellValue((String) obj);
            }
        }
        FileOutputStream out = new FileOutputStream(new File("C:/Users/madhu/Desktop/CrawledDataUsingJava.xlsx"));

        book.write(out);
        out.close();
        System.out.println("CrawledDataUsingJava.xlsx written successfully");
    }

    static class Test {
        /* Returns true if url is valid */
        public static boolean isValid(String input) {
            /* Try creating a valid URL */
            try {
                new URL(input).toURI();
                return true;
            }
            // If there was an Exception
            // while creating URL object
            catch (Exception e) {
                return false;
            }
        }
    }
}