import java.util.*;
public class Q1{

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	    String s1;
    String s2;

    s1= sc.nextLine();
    // System.out.print("enter string 2");
    // System.out.print("\n");
    s2= sc.nextLine();
		
	
		if (s1.length() == 0 && s2.length() == 0) {
		    
		System.out.print("both are equal and empty");
		System.out.print("\n");
		}
		else if (s1.length() == 0) {
		
		System.out.print(s2);
		System.out.print(" ");
		System.out.print("is greater");
		System.out.print("\n");
		}
		else if (s2.length() == 0) {
		    
		System.out.print(s1);
		System.out.print(" ");
		System.out.print("is greater");
		System.out.print("\n");
		}

		else {
			int flag = 0;
			int n = Math.min(s1.length(),s2.length());
			
			for (int i = 0; i < n; ++i) {
				if (s1.charAt(i) > s2.charAt(i)) {
					flag = 1;
					System.out.print(s1);
					System.out.print(" ");
					System.out.print("is greater");
					System.out.print("\n");
					break;
				}
				else if (s2.charAt(i) > s1.charAt(i)) {
					flag = 1;
					System.out.print(s2);
					System.out.print(" ");
					System.out.print("is greater");
					System.out.print("\n");
					break;
				}
			}
			if (flag == 0) {
			    
				if (s1.length() > s2.length()) {
				System.out.print(s1);
				System.out.print(" ");
				System.out.print("is greater");
				System.out.print("\n");
				}
				else if (s2.length() > s1.length()) {
				System.out.print(s2);
				System.out.print(" ");
				System.out.print("is greater");
				System.out.print("\n");
				}
				else {
				System.out.print("both strings are equal");
				System.out.print("\n");
				}
			}
		}
	
}}
