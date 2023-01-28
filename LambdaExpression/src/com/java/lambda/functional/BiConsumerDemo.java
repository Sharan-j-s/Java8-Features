package com.java.lambda.functional;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

// take two inputs, doesn't return anything

public class BiConsumerDemo {
    public static void main(String[] args) {

       // using lambda expression
       BiConsumer<Integer, Integer> bs =  (a, b) -> System.out.println(a+b);
       bs.accept(10,5);

       // example - using BiConsumer with HashMap
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"C++");
        map.put(2,"Java");
        map.put(3,"Python");

        map.forEach((k, v) -> System.out.println(k+" "+v));
    }

}
