package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> implements Iterable<SomeType>{

    private List<SomeType> list;
    private static Integer counter;

    public MyStack() {
        //throw new UnsupportedOperationException("Method not yet implemented");
        list = new ArrayList<>();
        this.counter = -1;
    }

    public Boolean isEmpty() {
        return list.isEmpty();
    }

    public void push(SomeType i) {
        list.add(i);
        this.counter++;
    }

    public SomeType peek() {
        //throw new UnsupportedOperationException("Method not yet implemented");
        if (!isEmpty()){
            return this.list.get(counter);
        }
        return null;
    }

    public SomeType pop() {
        if (!isEmpty()){
            SomeType temporal = list.get(counter);
            list.remove(counter);
            this.counter--;
            return temporal;
        }
        else {
            throw new EmptyStackException();
        }

    }

    @Override
    public Iterator<SomeType> iterator() {
            return list.iterator();
    }
}
