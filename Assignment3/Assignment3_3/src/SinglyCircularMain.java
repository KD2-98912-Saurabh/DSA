
public class SinglyCircularMain {

	public static void main(String[] args) {
		SinglyCircular list = new SinglyCircular();
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		list.addLast(9);
		list.deleteFirst();
		list.addFirst(8);
		list.addLast(7);
		list.deleteLast();
		list.addAtPossition(40, 2);
		list.deleteAtPosition(5);
		list.deleteAtPosition(2);
		list.deleteAtPosition(1);
		list.display();
		
	}

}
