import java.util.Scanner;
import java.util.Stack;

public class IntegerStack {

    // Stack to store integer elements
    private Stack<Integer> stack = new Stack<>();

    // Method to push an element onto the stack
    public void pushElement(int element) {
        stack.push(element);
        System.out.println("Pushed element: " + element);
    }

    // Method to pop an element from the stack
    public void popElement() {
        if (!stack.isEmpty()) {
            int element = stack.pop();
            System.out.println("Popped element: " + element);
        } else {
            System.out.println("Stack is empty. Cannot pop element.");
        }
    }

    public static void main(String[] args) {
        IntegerStack integerStack = new IntegerStack();
        Scanner scanner = new Scanner(System.in);

        // Example usage
        while (true) {
            System.out.println("Options: 1. Push Element 2. Pop Element 3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter an integer to push onto the stack: ");
                    int elementToPush = scanner.nextInt();
                    integerStack.pushElement(elementToPush);
                    break;
                case 2:
                    integerStack.popElement();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
