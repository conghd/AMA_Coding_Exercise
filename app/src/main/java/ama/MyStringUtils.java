
package ama;


/**
 * MyStringUtils is a simple class for string manipulation.
 * 
 * @author  Michael Hoang
 * @version 1.0
 */
class MyStringUtils {

    /**
     *  Return a shifted string from str one 
     * 
     * @param   str    a string obtained from user's input
     * @param   shift         a number of shift
     * @return              The shifted string
     */
    public static String shiftString(String str, int shift) {
        // Check if the string is null or its length is 0, 1
        if (str == null || str.length() <= 1) {
            return str;
        }

        int len = str.length();

        // If shift is 0 then return the str one
        if (shift == 0) {
            return str;
        }

        // If shift is negative, then covert to an equivalent positive shift 
        while (shift < 0) {
            shift += len;
        }

        // If shift is larger than the string's len, then convert to an equivalent shift 
        // which is smaller than the string's len
        if (shift >= len) {
            shift %= len;
        }

        char[] chars = new char[len];
        for (int i = 0; i < len; i++) {
            chars[(i + shift) % len] = str.charAt(i);
        }

        return String.valueOf(chars);
    }
}