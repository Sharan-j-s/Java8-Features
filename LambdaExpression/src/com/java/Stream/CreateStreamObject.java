package com.java.Stream;

/*
    Stream represents a sequence of objects from a source, which supports aggregate operations.

    Java provides package called java.util.stream. This package consists of classes, interfaces
    and an enum to allows functional-style operations on elements.

    How Stream Works?
    Source -> Filter -> Sort -> Map -> Collect

 */

import java.util.*;
import java.util.stream.Stream;

public class CreateStreamObject {
    public static void main(String[] args) {

        // create a stream
        Stream<String> stream = Stream.of("a","b","c");
        stream.forEach(System.out::println);

        System.out.println("--------------------------------");

        // create a stream from sources
        Collection<String> collection = Arrays.asList("JAVA","J2EE","Spring","Hibernate");
        Stream<String> stream2 = collection.stream();
        stream2.forEach(System.out::println);

        System.out.println("--------------------------------");

        List<String> list = Arrays.asList("JAVA","J2EE","Spring","Hibernate");
        Stream<String> stream3 = list.stream();
        stream3.forEach(System.out::println);

        System.out.println("--------------------------------");

        Set<String> set = new HashSet<>(list);
        Stream<String> stream4 = set.stream();
        stream4.forEach(System.out::println);

        System.out.println("--------------------------------");

        String[] strArray = {"a","s","d","f"};
        Stream<String> stream5 = Arrays.stream(strArray);
        stream5.forEach(System.out::println);


    }

}
