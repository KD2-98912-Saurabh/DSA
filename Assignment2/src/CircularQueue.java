import java.util.Scanner;

public class CircularQueue {
    private int SIZE;
    private int[] arr;
    private int front;
    private int rear;
    private int count;

    CircularQueue(int size) {
        SIZE = size;
        arr = new int[SIZE];
        front = rear = -1;
        count = 0;
    }

    public void offer(int value) {
        if (count == SIZE) {
            System.out.println("Queue is full");
        } else {
            rear = (rear + 1) % SIZE;
            arr[rear] = value;

            if (count == 0) {
                front = rear;
            }

            count++;
        }
    }

    public int poll() {
        if (count == 0) {
            System.out.println("Queue is empty");
            return -1;
        }

        int temp = arr[front];
        front = (front + 1) % SIZE;
        count--;

        if (count == 0) {
            front = rear = -1;
        }

        return temp;
    }

    public int peek() {
        if (count == 0) {
            System.out.println("Queue is empty");
            return -1;
        }

        return arr[front];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of queue:");
        int x = sc.nextInt();

        if (x <= 0) {
            System.out.println("Queue size must be positive");
            sc.close();
            return;
        }

        CircularQueue que = new CircularQueue(x);

        int choice;

        do {
            System.out.println("\n1. Offer");
            System.out.println("2. Poll");
            System.out.println("3. Peek");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    int n = sc.nextInt();
                    que.offer(n);
                    break;

                case 2:
                    int m = que.poll();
                    if (m != -1) {
                        System.out.println("Deleted: " + m);
                    }
                    break;

                case 3:
                    int value = que.peek();
                    if (value != -1) {
                        System.out.println("Front element: " + value);
                    }
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 0);

        sc.close();
    }
}