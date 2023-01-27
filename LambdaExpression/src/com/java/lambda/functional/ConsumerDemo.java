package com.java.lambda.functional;

// consumer interface takes input but doesn't return anything

import java.util.function.Consumer;

class ConsumerImpl implements Consumer<String>{

    @Override
    public void accept(String input) {
        System.out.println(input);
    }
}

public class ConsumerDemo {
    public static void main(String[] args) {

      /*  Consumer<String> cl = new ConsumerImpl();
          cl.accept("Sharan"); */

        //lambda expression
        Consumer<String> cs = (input) -> System.out.println(input);
        cs.accept("Hello World!");
    }
}
