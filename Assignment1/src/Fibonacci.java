import java.util.Scanner;
public class Fibonacci {
	public static int fib(int n) {
		if(n==1 || n==2) return 1;
		
		return fib(n-1)+fib(n-2);
	}
	
	public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter n : ");
	int n=sc.nextInt();
	
int val=fib(n);
System.out.println(val);
	}

}
