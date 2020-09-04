import java.util.*;  
public class Q3 {
   public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.print("enter string: ");
      System.out.print("\n");
      String s1=sc.nextLine();
      System.out.print("bfore sorting: ");
      System.out.print(s1);
      System.out.print("\n");	
      int j = 0;
      char temp = 0;
      char[] arr = s1.toCharArray();
      for(int i=0; i < arr.length; i++) {
         for(j=0; j < arr.length; j++) {
            if(arr[j] > arr[i]) {
               temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
            }
         }
      }
      System.out.print("After Sorting: ");
      for(int k=0; k < arr.length; k++) {
         System.out.print(arr[k]);
         
      }
      System.out.print("\n");
   }
   }