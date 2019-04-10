package rocks.zipcode.io.quiz4.objectorientation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {

    StringBuilder stringBuilder = new StringBuilder();
    Character delimeter;

    public StringAssembler(Character delimeter) {
        this.delimeter = delimeter;
    }

    public StringAssembler append(String str) {
        stringBuilder.append(str + delimeter);
        return this;
    }

    public String assemble() {
        return stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length()).toString();
    }



}
