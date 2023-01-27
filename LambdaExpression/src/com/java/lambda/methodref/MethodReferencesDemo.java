package com.java.lambda.methodref;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
interface Printable{
    void print(String msg);
}


public class MethodReferencesDemo {

    public void display(String msg){
        msg = msg.toUpperCase();
        System.out.println(msg);
    }

    public static int addition(int a, int b){
        return (a+b);
    }

    public static void main(String[] args) {
        // 1. Method reference to a static method

        // lambda expression
        Function<Integer, Double> function = (input) -> Math.sqrt(input);
        System.out.println(function.apply(4));

        // method reference
        Function<Integer, Double> functionMethodRef = Math::sqrt;
        System.out.println(functionMethodRef.apply(4));

        // lambda expression - for addition (static methods can be called using class name)
        BiFunction<Integer, Integer, Integer> biFunctionLambda = (a, b) -> MethodReferencesDemo.addition(a,b);
        System.out.println(biFunctionLambda.apply(10,15));

        // method reference
        BiFunction<Integer, Integer, Integer> biFunctionMethodRef = MethodReferencesDemo::addition;
        System.out.println(biFunctionMethodRef.apply(15,25));


        // 2. Method reference to an instance method of an object
        MethodReferencesDemo methodReferencesDemo = new MethodReferencesDemo();

        // lambda expression
        Printable printable = (msg) -> methodReferencesDemo.display(msg);
        printable.print("hello world!");

        // method reference
        Printable printableMethodRef = methodReferencesDemo::display;
        printableMethodRef.print("method ref print");


        // 3. Reference to the instance method of an arbitrary object
        // Sometimes, we call a method of argument in the lambda expression.
        // In that case, we can use a method reference to call an instance
        // method of an arbitrary object of a specific type.

        // lambda expression
        Function<String, String> stringFunction = (input) -> input.toLowerCase();
        System.out.println(stringFunction.apply("HELLO All.."));

        // method reference
        Function<String, String> stringFunctionMethodRef = String::toLowerCase;
        System.out.println(stringFunctionMethodRef.apply("HELLo WorlD"));

        // another example for the same

        String[] strArray = {"A","E","I","O","U","a","e","i","o","u"};

        // lambda expression
        Arrays.sort(strArray, (s1, s2) -> s1.compareToIgnoreCase(s2));

        // method reference
        Arrays.sort(strArray, String::compareToIgnoreCase);


        // 4. Reference to a constructor

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        // lambda expression
        Function<List<String>, Set<String>> setFunction = (fruitsList) -> new HashSet<>(fruitsList);
        System.out.println(setFunction.apply(fruits));

        // method reference
        Function<List<String>, Set<String>> setFunctionMethodRef = HashSet::new;
        System.out.println(setFunctionMethodRef.apply(fruits));




    }
}
