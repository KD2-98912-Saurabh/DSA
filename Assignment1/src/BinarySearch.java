//4. Implement binary search algorithm if array is sorted in descending order

import java.util.Scanner;
public class BinarySearch {
public static int binarySearch(int []arr,int target) {
	int left=0;
	int right=arr.length-1;
	while(left<=right) {
		int mid= (left+right)/2;
		if(arr[mid]==target) return mid;
		else if(target >arr[mid]) right=mid-1;
		else {
			left=mid+1;
		}
	}
	return -1;
	
}
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	int []arr= {10,8,7,6,5,4,3,2,1,0};
	int target;
	System.out.println("Enter target value : ");
	target=sc.nextInt();
	int idx=binarySearch(arr,target);
	System.out.println("at idx : "+idx);
}
}
