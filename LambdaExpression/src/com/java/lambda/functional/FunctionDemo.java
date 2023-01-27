package com.java.lambda.functional;

// we will see some predefined functional interfaces with example

// this function interface will take an input and return output

import java.util.function.Function;

class FunctionImpl implements Function<String, Integer>{

    @Override
    public Integer apply(String s) {
        return s.length();
    }
}

public class FunctinDemo {
    public static void main(String[] args) {
       /* Function<String, Integer> function = new FunctionImpl();
        int res = function.apply("Sharan");
        System.out.println(res); */

        Function<String, Integer> f = (s) -> s.length();
        System.out.println(f.apply("Sharanjs"));
    }
}
