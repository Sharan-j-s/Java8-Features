package com.java.Stream;

import java.util.*;
import java.util.stream.Stream;

public class FindElementsExample {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,2,1);

        // findFirst() and findAny() methods

        // findFirst() returns Optional
        Optional<Integer> element = list.stream().findFirst();
        if(element.isPresent())
            System.out.println(element.get());
        else
            System.out.println("stream is empty");


        // to findAny element
        Optional<Integer> element2 = list.stream().findAny();
        if(element2.isPresent())
            System.out.println(element2.get());
        else
            System.out.println("stream is empty");

        System.out.println("------------------------------------");

        // count(), min() and max() elements
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        System.out.println("Count => "+stream.count());

        Integer min = Stream.of(1,2,3,4,5,6,7,8,9).min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Min => "+min);

        Integer max = Stream.of(1,2,3,4,5,6,7,8,9).max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Max => "+max);



    }

}
