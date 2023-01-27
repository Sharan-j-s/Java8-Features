package com.java.lambda.optional;

// This class can help in avoiding null checks and nullpointer exception
// Do checkout the internal implementation of these methods which we have used here.

import javax.swing.text.html.Option;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        // of, empty, ofNullable these three static methods we can use to create optional objects

        String email = "git@github.com";

        // using empty
        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        // using of, (this method throws exception if email is null)
        Optional<String> emailOptional = Optional.of(email);
        System.out.println(emailOptional);

        // using ofNullable (this doesn't throw any exception because it is internally handled)
        Optional<String> stringOptional = Optional.ofNullable(email);
        System.out.println(stringOptional);
        // get method used to retrieve the value from this optional class object
        System.out.println(stringOptional.get());

        // In real-time project, we don't call the get() directly, instead we check whether the value is present or not
        // So for that we use isPresent()
        if(stringOptional.isPresent())
            System.out.println(stringOptional.get());
        else
            System.out.println("No value present");

        // we can also use orElse() in order to get output as default value, if there is no value
        Optional<String> stringOptional2 = Optional.ofNullable(email);
        String defaultOptional = stringOptional2.orElse("default@github.com");
        System.out.println(defaultOptional);

        // orElse() and orElseGet() method both are similar, but orElseGet() takes lambda expression as an argument
        String defaultOptional2 = stringOptional2.orElseGet(() -> "default@github.com");
        System.out.println(defaultOptional2);

        // we can also use orElseThrow() method, to check if value is present if not throw exception
        String optionalObject = stringOptional.orElseThrow(() -> new IllegalArgumentException("Email is not received"));
        System.out.println(optionalObject);

        // ifPresent() method
        Optional<String> gender = Optional.of("MALE");
        Optional<String> emptyOptional2 = Optional.empty();

        gender.ifPresent((s) -> System.out.println("value is present"));
        emptyOptional2.ifPresent((s) -> System.out.println("no value present"));


        // filter() method
        // Let's just take a look at the example without using optional for now

        String result = "abc";
        if(result != null && result.contains("abc"))
            System.out.println(result);

        // let's convert this to the optional class
        Optional<String> optionalStr = Optional.of(result);
        optionalStr.filter(res -> res.contains("abc"))
                .ifPresent((res) -> System.out.println(res));



        // map method in Optional provides a way to transform value in Optional from one type to another
        // added extra spaces to string abc

        String result2 = " abc ";
        if(result != null && result.contains("abc"))
            System.out.println(result);

        // let's convert this to the optional class
        Optional<String> optionalStr2 = Optional.of(result);
        optionalStr.filter(res -> res.contains("abc"))
                .map(String::trim)
                .ifPresent((res) -> System.out.println(res));

    }

}
