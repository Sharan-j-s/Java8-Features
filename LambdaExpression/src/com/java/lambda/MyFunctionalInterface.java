package com.java.lambda;

// Functional interface is an interface, which contains only one abstract method and it can contain any number of static or default methods
// This is an example to show how to create our own functional interfaces.

@FunctionalInterface
public interface MyFunctionalInterface {
    void print(String msg);

    default void m1(){
        System.out.println("default method");
    }

    static void m2(){
        System.out.println("static method");
    }
}
