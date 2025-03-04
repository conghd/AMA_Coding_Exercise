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
        System.out.println("Welcome to String Shifter!");
        System.out.print("Enter a string(letters only): ");
        // Read a line as a string from user's input
        String inputString = scanner.nextLine();

        System.out.print("Enter a number: ");
        // The loop run until user types a number
        while (!scanner.hasNextInt()) scanner.next();

        // Read a number from user's input
        Integer shiftAmount = scanner.nextInt();

        if (!inputString.matches("[a-zA-Z]+")) {
            System.out.println("Error: The input string must contain only letters.");
        } else {
            // Shift characters of the string
            String result = MyStringUtils.shiftString(inputString, shiftAmount);
            System.out.println("Shifted String: " + result);
        }
        
        scanner.close();
    }

    public String getGreeting() {
        return "Hello String Shifter!";
    }
}