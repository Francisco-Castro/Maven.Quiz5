package rocks.zipcode.io.quiz4.generics;

import java.util.*;
import java.util.stream.Stream;

/**
 * @author leon on 11/12/2018.
 */
public class    ComparableTreeSet<_> implements Iterable<_>{

//
    private List<_> list;
    private Integer counter;
//
    public ComparableTreeSet(_... arr) {
//        list = Arrays.asList(arr);
//
////        System.out.println(arr.getClass());
////        System.out.println(arr.getClass().getSimpleName());
////        System.out.println(arr.getClass().getCanonicalName());
////        System.out.println(arr.getClass().getComponentType().getSimpleName());
//        if ( arr.getClass().getComponentType().getSimpleName().equals("String")){
//            System.out.println("A");
//            counter = list.stream()
//                    .map(x ->  suma((String) x) )
//                    .reduce(1,Integer::sum);
//        }
//        else {
//
//            System.out.println("B" + arr);
//            System.out.println( arr.getClass(). );
//
//        }
//
//

    }


    public Integer suma(String str){
        return Math.toIntExact(Arrays.stream(str.split(""))
                .map(x -> (int) x.charAt(0))
                .reduce(0,Integer::sum));
    }

    public ComparableTreeSet() {
    }

    public int compareTo(ComparableTreeSet<_> o) {


        System.out.println( this.counter + " " + o.counter);

        if (this.counter == o.counter ) return 0;
        return this.counter < o.counter ? -1 : 1;
    }

    public Integer getCounter() {
        return counter;
    }

    public List<_> getList() {
        return list;
    }


    @Override
    public Iterator<_> iterator() {
        return list.iterator();
    }
}
