
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        // Scanner tool for reading user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter their name
        System.out.println("What's your name?");

        // Store name into variable
        String name = scanner.nextLine();

        // Use string concatenation to print a greeting
        System.out.println("Hi " + name);
    }
}