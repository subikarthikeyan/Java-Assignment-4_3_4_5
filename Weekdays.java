import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        // Initialize an array with the names of the weekdays
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the day index (0 for Sunday, 1 for Monday, ..., 6 for Saturday): ");

        try {
            // Read the user's input
            int index = scanner.nextInt();

            // Attempt to access the array at the given index
            System.out.println("The day is: " + weekdays[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the exception if the index is out of bounds
            System.out.println("Invalid index. Please enter a number between 0 and 6.");
        } catch (Exception e) {
            // Handle any other exceptions that may occur
            System.out.println("Invalid input. Please enter a valid number.");
        }

        // Close the scanner
        scanner.close();
    }
}
