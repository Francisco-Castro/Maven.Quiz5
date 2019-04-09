package rocks.zipcode.io.quiz4.fundamentals;

import java.util.Arrays;
import java.util.Collection;

/**
 * @author leon on 18/12/2018.
 */

    // TODO Ask about Test who the comparison is done??
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        StringEvaluator stringEvaluator = new StringEvaluator();

        return Arrays.asList(stringEvaluator.getAllSubstrings(string))
                .stream()
                .filter( x -> isPalindrome(x) )
                .toArray(String[]::new);
    }

    public static Boolean isPalindrome(String string) {
        return reverseString(string).equals(string) ? true : false;
    }

    public static String reverseString(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string).reverse();
        return stringBuilder.toString();
    }
}
