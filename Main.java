
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        while (!scanner.hasNextInt()) scanner.next();

        Integer num = scanner.nextInt();

        String output = MyStringUtils.shift(text, num);

        System.out.println("Output: '" + output + "'");

        scanner.close();
    }
}