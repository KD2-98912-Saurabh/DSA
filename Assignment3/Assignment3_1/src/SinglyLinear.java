
public class SinglyLinear {
	class Node{
		private int data;
		private Node next;
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	private Node head;
	public SinglyLinear() {
		head = null;
	}
	
	
	public void addFirst(int value) {
		Node newnode = new Node(value);
		if(isEmpty()) {
			head = newnode;
		}
		else {
			newnode.next = head;
			head = newnode;
		}
	}
	
	
	public void insertAfter(int key, int value) {
		Node trav = head;
		Node newnode = new Node(value);
		if(isEmpty()) {
			System.out.println("List is empty");
			return;
		}
		
		while(trav!=null && trav.data != key) {
			trav = trav.next;
		}
		
		if (trav == null) {
	        System.out.println("Data not found");
	        return;
	    }
	
		newnode.next = trav.next;
		trav.next = newnode;

	}
	
	
	public void insertBefore(int key, int value) {
		Node trav = head;
		Node newnode = new Node(value);
		
		if(isEmpty()) {
			System.out.println("List is empty");
			return;
		}
		else if(head.data==key) {
			newnode.next = head;
			head = newnode;
		}
		else {
			while(trav.next!=null && trav.next.data!=key) {
				trav = trav.next;
			}
			newnode.next = trav.next;
			trav.next = newnode;
		}
		if (trav.next == null) {
	        System.out.println("Data not found");
	        return;
	    }
	}
	
	
	public void display() {
		Node trav = head;
		if(isEmpty()) {
			System.out.println("List is empty");
			return;
		}
		else {
			do{
				System.out.print(trav.data + " --> ");
				trav = trav.next;
			}while(trav!= null);
		}
	}
	
	public boolean isEmpty() {
		return head==null;
	}
}
