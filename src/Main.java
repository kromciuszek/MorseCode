import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MorseDictionary dictionary = new MorseDictionary();
    private static PlayMorse playMorse = new PlayMorse();

    public static void main(String[] args) {

        boolean exit = false;
        int choice = 1;

        while (!exit) {
            printMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    translateToMorse();
                    break;
                case 2:
                    exit = true;
                    System.out.println("See you!");
                    break;
            }

        }
    }

    private static void printMenu() {
        System.out.println("Hello, stranger! What do you want to do?");
        System.out.println("\t 1. Translate String to MorseCode");
        System.out.println("\t 2. Exit!");
        System.out.print("Your choice: ");
    }

    private static void translateToMorse() {

        // clear scanner
        scanner.nextLine();

        // Ask for text
        System.out.print("Type your String here: ");
        String userInput = scanner.nextLine();

        // Translate into MorseCode
        System.out.println("Translated String:");
        String morse = dictionary.translate(userInput);

        // Print translated String
        System.out.println(morse);

        // Play sound
        playMorse.playString(morse);
    }
}
