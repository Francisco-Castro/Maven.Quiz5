package rocks.zipcode.io.quiz4.objectorientation;

import rocks.zipcode.io.quiz4.fundamentals.StringEvaluator;

/**
 * @author leon on 19/12/2018.
 */
public class StringEvaluatorObject {

    private StringEvaluator stringEvaluator;
    private String string;

    public StringEvaluatorObject(String str) {
        stringEvaluator = new StringEvaluator();
        this.string = str;
    }

    public String[] getAllSubstrings() {
        return stringEvaluator.getAllSubstrings(string);
    }

    public String[] getCommonSubstrings(String secondInput) {
        return stringEvaluator.getCommonSubstrings(string,secondInput);
    }

    public String getLargestCommonSubstring(String secondInput) {
        return stringEvaluator.getLargestCommonSubstring(string,secondInput);
    }
}
