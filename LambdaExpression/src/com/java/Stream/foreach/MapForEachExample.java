package com.java.Stream.foreach;

import java.util.HashMap;
import java.util.Map;

public class MapForEachExample {
    public static void main(String[] args) {

        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Rakshith",22));
        map.put(2,new Person("Varun",36));
        map.put(3,new Person("Arun",26));

        // use for each loop
        for (Map.Entry<Integer, Person> entry : map.entrySet())
            System.out.println(entry.getKey()+" "+entry.getValue().getName());

        // use forEach() method + lambda
        map.forEach((k, v) ->System.out.println(k+" "+v.getName()));
    }
}
