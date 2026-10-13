//1. Write program to implement linear queue in which front and rear starts at 0
import java.util.Scanner;
public class LinearQueue {
public static class LQ{
	private int front,rear,SIZE;
	private int[]arr;
	
	public LQ(int size) {
		SIZE=size;
		front=rear=0;
		arr=new int[SIZE];
	}
	
	public void offer(int val) {
	if(isFull()) {
		System.out.println("Queue is full ");
		return;
	}
	else {
		arr[rear]=val;
		rear++;
		}
	}
	
	public boolean isFull() {
		return rear==arr.length-1;
	}
	
	public boolean isEmpty() {
		return front==rear;
	}
	
	public int poll(){
		if(isEmpty()){
			System.out.println("Queue is empty ");
		}
		else {
			int po=arr[front];
			front++;
			return po;
		}
		return -1;
	}
	
	public  int peek() {
		if(isEmpty()) {
			System.out.println("Queue is empty ");
			return -1;
		}
		else {
			return arr[front];
		}
	}
	

	
}

public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
//	LinearQueue q=new LinearQueue();
	LQ q=new LQ(5);
	int choice;
	System.out.println("Enter choice : ");
do {
	System.out.println("1 Offer ");
	System.out.println("2 Poll ");
	System.out.println("3 Peek");
	choice=sc.nextInt();
	
	switch(choice) {
	case 1:
		int n;
		System.out.println("enter ");
		n=sc.nextInt();
		q.offer(n);
		break;
	case 2:
		int m=q.poll();
		System.out.println("deleted"+m);
		break;
		
	case 3:
		int o=q.peek();
		System.out.println(o);
	}
	
	
}while(choice!=0);
	
	
	
	
}
}
