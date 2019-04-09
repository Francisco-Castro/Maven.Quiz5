package rocks.zipcode.io.quiz4.generics;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author leon on 11/12/2018.
 * [[a, b, c]  [a, b]   [a, c]   [a]    -> [1,2,3], [1,2], [1,3], [1]
 *  [b, a]     [b, c]   [b]             ->          [2,1], [2,3], [2]
 *  [c, a]     [c, b]   [c]             ->          [3,1], [3,2], [3]
 *  []
 *  ]
 */


public class GenericUtils {
    public static <_ extends Comparable> Iterable<? extends Iterable<_>> powerSet(Set<_> originalSet) {

//        if (originalSet.size() == 0) {
//            List<List<_>> result = new ArrayList<List<_>>();
//            result.add(new ArrayList<_>());
//            return result;
//        }
//        //_ firstElement = originalSet.stream().iterator().next();
//        _ firstElement = originalSet.iterator().next();
//        List<List<_>> returnValue = new ArrayList<List<_>>();
//        List<List<_>> permutations = (List<List<_>>) powerSet(originalSet);
//        for (List<_> smallerPermutated : permutations) {
//            for (int index=0; index <= smallerPermutated.size(); index++) {
//                List<_> temp = new ArrayList<_>(smallerPermutated);
//                temp.add(index, firstElement);
//                returnValue.add(temp);
//            }
//        }
//
//        System.out.println(returnValue);

        return null;
    }

    public static <_ extends Comparable> Iterable<? extends Iterable<_>> powerSet(_... originalSet) {
        return powerSet(new TreeSet<>(Arrays.asList(originalSet)));
    }
}

