
import java.util.Scanner;

/**
 * 
 * Main class is the entry point of the program
 * @author Michael Hoang
 */
public class Main {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        // Read a line as a string from user's input
        String text = scanner.nextLine();

        // The loop run until user types a number
        while (!scanner.hasNextInt()) scanner.next();

        // Read a number from user's input
        Integer num = scanner.nextInt();

        // Shift characters of the string
        String output = MyStringUtils.shift(text, num);

        System.out.println("Output: '" + output + "'");

        scanner.close();
    }
}