//2. Write a program to implement descending stack. (Initialize top = SIZE)
import java.util.Scanner;
public class DescStack {
public static class stack{
	private int top;
	private int[]arr;
	private int size;
	
	public stack(int val) {
		size=val;
		arr=new int[size];
		top=size;
	}
	
	public void push(int val) {
		if(isFull()) {
			System.out.println("Stack is full ");
			return;
		}
		else {
			arr[--top]=val;
		}
		
	}
	
	public int pop() {

		if(isEmpty()) {
			System.out.println("Stack is empty ");
			return -1;
		}
		else {
			int temp=arr[top];
			top++;
			return temp;
		}
	
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("stack is empty ");
		}
		else {
			return arr[top];
		}
		return -1;
	}
	
	public boolean isFull() {
		return top==0;
	}
	public boolean isEmpty() {
		return top==size;
	}
}

public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
//	LinearQueue q=new LinearQueue();
	stack st=new stack(5);
	int choice;
	System.out.println("Enter choice : ");
do {
	System.out.println("1 push ");
	System.out.println("2 Pop ");
	System.out.println("3 Peek");
	choice=sc.nextInt();
	
	switch(choice) {
	case 1:
		int n;
		System.out.println("enter ");
		n=sc.nextInt();
		st.push(n);
		break;
	case 2:
		int m=st.pop();
		System.out.println("Popped "+m);
		break;
		
	case 3:
		int o=st.peek();
		System.out.println(o);
	}
	
	
}while(choice!=0);
	
	
	
	
}
	
}

