
public class SinglyLinearMain {

	public static void main(String[] args) {
		SinglyLinear sl = new SinglyLinear();
		sl.addFirst(10);
		sl.addFirst(20);
		sl.insertAfter(20, 15);
		sl.insertAfter(10, 5);
		sl.insertBefore(15, 18);
		sl.insertBefore(20, 25);
		sl.display();
	}

}
