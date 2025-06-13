
import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {
        // Scanner tool to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to write a message
        System.out.println("Write a message:");

        // Read input from user
        String message = scanner.nextLine();

        // Print user's input three times
        System.out.println(message);
        System.out.println(message);
        System.out.println(message);
    }
}