import java.util.*;
public class Q6{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int t;
	t= sc.nextInt();
	while ((t--) != 0) {
		long n;
		n = sc.nextInt();
		while (n > 1) {
			if (n % 2 == 0) {
				System.out.print(n / 2);
				System.out.print(" ");
				n = n / 2;
			}
			else {
				System.out.print(n * 3 + 1);
				System.out.print(" ");
				n = n * 3 + 1;
			}

		}
		System.out.print("\n");
	}
}}