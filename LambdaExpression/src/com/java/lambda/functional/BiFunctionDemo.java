package com.java.lambda.functional;

import java.util.function.BiFunction;
import java.util.function.Function;

// take two inputs, returns output

public class BiFunctionDemo{

    public static void main(String[] args) {
        // Using anonymous class
        BiFunction<Integer, Integer, Integer> biFunction = new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer t, Integer u) {
                return (t + u);
            }
        };
        System.out.println(biFunction.apply(10,15));

        // Using lambda expression
        BiFunction<Integer, Integer, Integer> biFunction1 = (t, u) -> (t + u);
        System.out.println(biFunction.apply(12,36));


        // using andThen() method
        Function<Integer, Integer> function = (num) -> (num * num);
        Integer integer = biFunction.andThen(function).apply(10,20);
        System.out.println(integer);

    }
}
