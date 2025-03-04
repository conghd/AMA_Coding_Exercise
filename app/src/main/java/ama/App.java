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

        if (!inputString.matches("[a-zA-Z]+")) {
            System.out.println("Error: The input string must contain only letters.");
            scanner.close();
            return;
        } 

        System.out.print("Enter a number: ");
        // Read a number from user's input
        Integer shiftAmount = scanner.nextInt();

        // Shift characters of the string
        String result = MyStringUtils.shiftString(inputString, shiftAmount);
        System.out.println("Shifted String: '" + result + "'");
        
        
        scanner.close();
    }

    public String getGreeting() {
        return "Hello String Shifter!";
    }
}