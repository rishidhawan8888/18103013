import java.util.*;
public class Q2{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int t;
	t= sc.nextInt();
	while ((t--) != 0) {
		int n;
		n = sc.nextInt();
		int[] arr = new int[n];
		int[] dp = new int[21];
		for (int i = 0; i < n; ++i) {
			arr[i] =  sc.nextInt();
			dp[arr[i]]++;
		}
		for (int i = 0; i < 21; ++i) {
			if (dp[i] > 0) {
				for (int j = 0; j < dp[i]; ++j) {
				System.out.print(i);
				System.out.print(" ");
				}
			}
		}
		System.out.print("\n");
	}
}}