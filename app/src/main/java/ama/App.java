package ama;


import java.util.Scanner;
import ama.MyStringUtils;

/**
 * 
 * Main class is the entry point of the program
 * @author Michael Hoang
 */
public class App {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a string:");
        // Read a line as a string from user's input
        String text = scanner.nextLine();

        System.out.println("Input a number:");
        // The loop run until user types a number
        while (!scanner.hasNextInt()) scanner.next();

        // Read a number from user's input
        Integer num = scanner.nextInt();

        // Shift characters of the string
        String output = MyStringUtils.shiftString(text, num);

        System.out.println("Output: '" + output + "'");

        scanner.close();
    }

    public String getGreeting() {
        return "Hello String Shifter!";
    }
}