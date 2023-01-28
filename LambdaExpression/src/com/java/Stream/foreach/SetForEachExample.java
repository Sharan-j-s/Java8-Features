package com.java.Stream.foreach;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Person class can be found in ListEForEachExample.java file

public class SetForEachExample {
    public static void main(String[] args) {

        Set<Person> set = new HashSet<>();
        set.add(new Person("Tony",29));
        set.add(new Person("Sharath",22));
        set.add(new Person("Manoj",35));
        set.add(new Person("Vijay",23));

        // Prior Java 8
        for (Person person : set)
            System.out.println(person.getName()+" "+person.getAge());

        // forEach method + lambda
        set.forEach((person -> System.out.println(person.getName()+" "+person.getAge())));

        // using stream with forEach
        set.stream().forEach((person -> System.out.println(person.getName()+" "+person.getAge())));
    }
}


