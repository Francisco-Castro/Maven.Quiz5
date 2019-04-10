package rocks.zipcode.io.quiz4.generics.genericarrayutils.powerset;

import org.junit.Assert;
import rocks.zipcode.io.quiz4.generics.GenericUtils;

/**
 * @author leon on 15/12/2018.
 * INPUT: {"a", "b", "c"};
 * [[a, b, c], [a, b], [a, c], [a],
 * [b, a], [b, c], [b],
 * [c, a], [c, b], [c],
 * []]
 */

// TODO PowerSET pending
public class PowerSetTest {
    public static void test(String[] input, String expectedString) {
        // given

        // when
        Iterable<? extends Iterable<? extends String>> actualSet = GenericUtils.powerSet(input);
        String actualString = actualSet.toString();

        // then
        Assert.assertEquals(expectedString, actualString);
    }
}
