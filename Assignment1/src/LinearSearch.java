import java.util.Scanner;
public class LinearSearch {
	
	public static int  linearSearch(int [] arr,int target) {
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]==target) return i;
		}
		return -1;
	}
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	int n;
	System.out.println("Enter size of array : ");
	n=sc.nextInt();
	int [] arr=new int[n];
	
	for(int i=0;i<n;i++) {
		System.out.println("Enter element at idx "+i+" : ");
		arr[i]=sc.nextInt();
	}
	
	System.out.print("[");
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
		
	}
	System.out.print("]");
	int target ;
	System.out.println("Enter target : ");
	target=sc.nextInt();
	

	int lastOccurance=linearSearch(arr,target);
	System.out.println("last index of target is : "+lastOccurance);
}
}
