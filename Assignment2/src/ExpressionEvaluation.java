
import java.util.Scanner;
import java.util.Stack;

public class ExpressionEvaluation {

    public static int postfixEvaluation(String exp) {
        Stack<Integer> st = new Stack<>();

        String[] tokens = exp.trim().split("\\s+");

        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];

            if (isOperator(token)) {
                int b = st.pop();
                int a = st.pop();

                int result = calculate(a, b, token);
                st.push(result);
            } else {
                st.push(Integer.parseInt(token));
            }
        }

        return st.pop();
    }

    // Prefix Evaluation
    public static int prefixEvaluation(String exp) {
        Stack<Integer> st = new Stack<>();

        String[] tokens = exp.trim().split("\\s+");

        for (int i = tokens.length - 1; i >= 0; i--) {
            String token = tokens[i];

            if (isOperator(token)) {
                int a = st.pop();
                int b = st.pop();

                int result = calculate(a, b, token);
                st.push(result);
            } else {
                st.push(Integer.parseInt(token));
            }
        }

        return st.pop();
    }


    public static boolean isOperator(String token) {
        return token.equals("+") ||
               token.equals("-") ||
               token.equals("*") ||
               token.equals("/") ||
               token.equals("%");
    }


    public static int calculate(int a, int b, String op) {
        switch (op) {
            case "+":
                return a + b;

            case "-":
                return a - b;

            case "*":
                return a * b;

            case "/":
                return a / b;

            case "%":
                return a % b;

            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\\n1. Postfix Evaluation");
            System.out.println("2. Prefix Evaluation");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter postfix expression:");
                    String postfix = sc.nextLine();

                    System.out.println(
                        "Result: " + postfixEvaluation(postfix)
                    );
                    break;

                case 2:
                    System.out.println("Enter prefix expression:");
                    String prefix = sc.nextLine();

                    System.out.println(
                        "Result: " + prefixEvaluation(prefix)
                    );
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
