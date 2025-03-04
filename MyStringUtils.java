
/**
 * MyStringUtils is a simple class for string manipulation.
 * 
 * @author  Michael Hoang
 * @version 1.0
 */
class MyStringUtils {

    /**
     *  Return a shifted string from original one 
     * 
     * @param   original    a string obtained from user's input
     * @param   number         a numberber of shift
     * @return              The shifted string
     */
    public static String shift(String original, int number) {
        // Check if the string is null or its length is 0, 1
        if (original == null || original.length() <= 1) {
            return original;
        }

        int len = original.length();

        // If number is 0 then return the original one
        if (number == 0) {
            return original;
        }

        // If number is negative, then covert to an equivalent positive numberber
        while (number < 0) {
            number += len;
        }

        // If number is larger than the string's len, then convert to an equivalent numberber
        // which is smaller than the string's len
        if (number >= len) {
            number %= len;
        }

        char[] chars = new char[len];
        for (int i = 0; i < len; i++) {
            chars[(i + number) % len] = original.charAt(i);
        }

        return String.valueOf(chars);
    }
}