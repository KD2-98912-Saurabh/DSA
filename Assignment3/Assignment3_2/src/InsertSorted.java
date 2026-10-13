
public class InsertSorted {
	class Node{
		private int data;
		private Node next;
		
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	private Node head;
	public InsertSorted() {
		head = null;
	}
	
	public void insertSorted(int value) {
		Node newnode = new Node(value);
		
		if(isEmpty()) {
			head = newnode;
		}
		else if(value < head.data) {
			newnode.next = head;
			head = newnode;
		}
		else {
			Node trav = head;
			while(trav.next!= null &&  trav.next.data <= value) {
				trav = trav.next;
			}
			newnode.next = trav.next;
			trav.next = newnode;
		}
	}
	
	public void display() {
		Node trav = head;
		
		if(isEmpty()) {
			System.out.println("List is empty");
			return;
		}
		else {
			while(trav!=null) {
				System.out.print(trav.data + " --> ");
				trav = trav.next;
			}
		}
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	
	public static void main(String[] args) {
		InsertSorted insert = new InsertSorted();
		insert.insertSorted(10);
		insert.insertSorted(10);
		insert.insertSorted(5);
		insert.insertSorted(100);
		insert.insertSorted(50);
		insert.insertSorted(70);
		insert.display();
	}

}
