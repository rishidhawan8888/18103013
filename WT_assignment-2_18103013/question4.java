import java.util.*;
public class Q4{
    public static void main(String[] args){
        int n=1;
        int s=1;
        while(n<Integer.MAX_VALUE){
            if(s==n*n){
                System.out.print("Minimum number is: ");
		System.out.print(n);
		System.out.print("\n");
		
            }
            n=n+1;
            s=s+n;
        }
        System.out.print("Last loop number is: ");
	System.out.print(n);
	System.out.print("\n");
    }
}