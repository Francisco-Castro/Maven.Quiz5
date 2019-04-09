package rocks.zipcode.io.quiz4.fundamentals;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {

        Integer strLen = string.length();

        String[] xx = IntStream
                .range(0,strLen)
                .mapToObj( a -> {
                    List<String> x = IntStream
                            .range(a, strLen)
                            .mapToObj(b -> string.substring(a, b + 1) )
                            .collect(Collectors.toList());
                    return x;
                })
                .flatMap(x -> x.stream())
                .distinct()
                .toArray(String[]::new);

        return xx;
    }

    public static String[] getCommonSubstrings(String string1, String string2) {

        List<String> list1 = Arrays.asList(getAllSubstrings(string1));
        List<String> list2 = Arrays.asList(getAllSubstrings(string2));

        return list1
                .stream()
                .filter( x -> list2.contains(x) )
                .toArray(String[]::new);
    }

    public static String getLargestCommonSubstring(String string1, String string2) {

        return Arrays.asList(getCommonSubstrings(string1,string2))
                .stream()
                .max(Comparator.comparingInt(String::length))
                .get();
    }
}
