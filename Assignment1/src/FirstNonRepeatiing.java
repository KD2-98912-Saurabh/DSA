
//8. find the first non-repeating element: Input:{ 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 } Ouput: 3

import java.util.Scanner;
public class FirstNonRepeatiing {
public static int 	firstNonRepeating(int []arr ) {
	for(int i=0;i<arr.length;i++) {
		int count=0;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j])count++;
		}
		if(count==0)return arr[i]; 
	}
	return -1;
}
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	int []arr={ 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
	int ele=firstNonRepeating(arr);
	System.out.println(ele);
	
}
}
