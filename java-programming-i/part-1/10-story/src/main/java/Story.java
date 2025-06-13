
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        // User scanner tool for reading user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the main character's name, get the input and store it in a variable
        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        String mainCharacter = scanner.nextLine();

        // Prompt the user to enter the main character's job, get the input and store it in a variable
        System.out.println("What is their job?");
        String job = scanner.nextLine();

        // Print story using user input
        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was " + mainCharacter + ", who was " + job + ".");
        System.out.println("On the way to work, " + mainCharacter + " reflected on life.");
        System.out.println("Perhaps " + mainCharacter + " will not be " + job + " forever.");
    }
}