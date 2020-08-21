import java.util.*;
public class Q1{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("enter bigger string 1");
System.out.print("\n");
String s1;
String s2;

s1= sc.nextLine();
System.out.print("enter string 2");
System.out.print("\n");
s2= sc.nextLine();
if (s1.length() < s2.length()) {
System.out.print(0);
System.out.print("\n");
}
else {
	int r = 0;
	ArrayList<Character> v1 = new ArrayList<Character>();
	ArrayList<Character> v2 = new ArrayList<Character>();
	for (int i = 0; i < s2.length(); ++i) {
	v2.add(s2.charAt(i));
	}
	Collections.sort(v2);


	for (int i = 0; i + s2.length() <= s1.length(); ++i) {
	v1.clear();
	for (int j = i; j < i + s2.length(); ++j) {
	v1.add(s1.charAt(j));
	}
	Collections.sort(v1);
	int flag = 0;
	for (int j = 0; j < v1.size(); ++j) {
	if (v1.get(j) != v2.get(j)) {
	flag++;
	}
	}
	if (flag == 0) {
	r++;
	}


	}
System.out.print(r);
System.out.print("\n");
}


}}
