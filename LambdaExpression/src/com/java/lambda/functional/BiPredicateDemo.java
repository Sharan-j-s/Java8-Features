package com.java.lambda.functional;

// take two inputs, returns boolean
// provides test() method
// we can use this whenever we need to compare two things and provide output in form of boolean

import java.util.function.BiPredicate;

// traditional implementation of BiPredicate, you can use the same for consumer, function etc..
/* public class BiPredicateDemo implements BiPredicate<String, String> {

    public static void main(String[] args) {
        BiPredicate<String, String> biPredicate = new BiPredicateDemo();
        System.out.println(biPredicate.test("ramesh","ramesh"));
        System.out.println(biPredicate.test("svu","sVu"));
    }

    @Override
    public boolean test(String s1, String s2) {
        return s1.equals(s2);
    }

} */

public class BiPredicateDemo{

    public static void main(String[] args) {
        // Anonymous class
       /* BiPredicate<String, String> biPredicate = new BiPredicate<String, String>() {
            @Override
            public boolean test(String s1, String s2) {
                return s1.equals(s2);
            }
        }; */

        // lambda expression
        BiPredicate<String, String> biPredicate = (s1,  s2) ->  s1.equals(s2);
        System.out.println(biPredicate.test("ramesh","ramesh"));
        System.out.println(biPredicate.test("svu","sVu"));

        System.out.println("-------------------------------");

        // Example and, or methods in BiPredicate
        BiPredicate<Integer, Integer> biPredicate2 = (x,  y) ->  x > y;
        BiPredicate<Integer, Integer> biPredicate3 = (x,  y) ->  x == y;

        boolean result = biPredicate2.and(biPredicate3).test(20,10);
        System.out.println(result);

        boolean result2 = biPredicate2.or(biPredicate3).test(20,10);
        System.out.println(result2);

    }
}




