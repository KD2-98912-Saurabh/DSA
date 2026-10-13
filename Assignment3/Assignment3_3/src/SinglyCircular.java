
public class SinglyCircular {
	class Node{
		private int data;
		private Node next;
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	private Node head, tail;
	private int size;
	public SinglyCircular() {
		head = tail = null;
		size = 0;
	}
	
	public boolean isEmpty() {
		return head == null && tail == null;
	}
	
	public void addFirst(int value) {
		Node newnode = new Node(value);
		if(isEmpty()) {
			head=tail=newnode;
			newnode.next = newnode;
		}
		else {
			newnode.next = head;
			tail.next = newnode;
			head = newnode;
		}	
		size++;
	}
	
	public void display() {
		if(isEmpty())
			return;
		
		Node trav = head;
		do {
			System.out.print(trav.data + " --> ");
			trav = trav.next;
		}while(trav != head);
		System.out.println();
		System.out.println("Size : " + size);
	}
	
	
	public void addLast(int value) {
		Node newnode = new Node(value);
		if(isEmpty()) {
			head=tail=newnode;
			newnode.next = newnode;
		}
		else {
			tail.next = newnode;
			tail = newnode;
			newnode.next = head;
			
		}
		size++;
	}
	
	public void deleteFirst() {
		if(isEmpty())
			return;
		else if(head==tail) {
			head = tail = null;
		}
		else {
			tail.next = head.next;
			head = tail.next;
		}
		size--;
	}
	
	public void deleteLast() {
		if(isEmpty())
			return;
			
		else if(head==tail){
			head = tail = null;
		}
		else {
			Node trav = head;
			while(trav.next.next != head) {
				trav = trav.next;
			}
			trav.next = head;
			tail = trav;
		}
		size--;
	}
	
	public void deleteAll() {
		head = tail = null;
		size = 0;
	}
	
	public void addAtPossition(int value, int pos) {
	    if (pos < 1 || pos > size + 1) {
	        System.out.println("Invalid position");
	        return;
	    }

	    Node newnode = new Node(value);

	    if (isEmpty()) {
	        head = tail = newnode;
	        newnode.next = newnode;
	    }
	    else if (pos == 1) {
	        newnode.next = head;
	        head = newnode;
	        tail.next = head;
	    }
	    else if (pos == size + 1) {
	        tail.next = newnode;
	        tail = newnode;
	        tail.next = head;
	    }
	    else {
	        Node trav = head;

	        for (int i = 1; i < pos - 1; i++) {
	            trav = trav.next;
	        }

	        newnode.next = trav.next;
	        trav.next = newnode;
	    }

	    size++;
	}
	
	public void deleteAtPosition(int pos) {
		if(isEmpty() || pos < 1 || pos > size)
			return;
		
		else if(head==tail) {
			head = tail = null;
		}
		
		else if(pos==1) {
			tail.next = head.next;
			head = tail.next;
		}
		
		else {
			Node trav = head;
			for(int i=1; i<pos-1; i++) {
				trav = trav.next;
			}
			trav.next = trav.next.next;
			if(pos==size) {
				tail = trav;
			}
		}
		size--;
	}
}