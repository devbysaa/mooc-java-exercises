
import java.util.Scanner;

public class Conversation {

    public static void main(String[] args) {
        // User scanner tool for reading input
        Scanner scanner = new Scanner(System.in);

        // Print message to user and wait for user input
        System.out.println("Greetings! How are you doing?");
        scanner.nextLine();

        // Print another message and wait for user input
        System.out.println("Oh, how interesting. Tell me more!");
        scanner.nextLine();

        // Print final message
        System.out.println("Thanks for sharing!");
    }
}