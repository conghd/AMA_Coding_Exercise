
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        System.out.println(text);

        scanner.close();
    }

    public static String shift(String original, int number) {
        // Check if the string is null or its length is 0, 1
        // Then it is not needed to convert
        if (original == null || original.length() <= 1) {
            return original;
        }

        int len = original.length();
        if (num == 0) {
            return original;
        }

        while (num < 0) {
            num += len;
        }

        if (num >= len) {
            num %= len;
        }

        char[] chars = new char[len];
        for (int i = 0; i < len; i++) {
            chars[(i + num) % len] = original.charAt(i);
        }

        return String.valueOf(chars);
    }
}