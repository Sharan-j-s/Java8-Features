package com.java.lambda;

// This represents the traditional way of programming, with the use of polymorphism(overrided method) concept
// We can use lambda expression here, in order to make it simpler (minimize the line of code)
// This Shape interface is called a functional interface because it contains only one abstract method(draw)

interface Shape{
    void draw();
}

/*
class Rectangle implements Shape{
    // Check the lambda expression written inside main method
    @Override
    public void draw() {
        System.out.println("Rectangle class : draw() method");
    }
}

class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Square class : draw() method");
    }
}

class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Circle class : draw() method");
    }
}

*/

public class LambdaExample {
    public static void main(String[] args) {
        //rectange is the reference varialbe, we can call draw function using this variable
        /////Shape rectangle = () -> System.out.println("Rectangle class : draw() method");
        //rectangle.draw();

        ////Shape square = () -> System.out.println("Square class : draw() method");
        //square.draw();

        ////Shape circle = () -> System.out.println("Circle class : draw() method");
        //circle.draw();

        //using the print method to print contents
        /*print(rectangle);
        print(square);
        print(circle); */

        // we can directly pass lambda expression as a parameter
        print(() -> System.out.println("Rectangle class : draw() method"));
        print(() -> System.out.println("Square class : draw() method"));
        print(() -> System.out.println("Circle class : draw() method"));




        // If there are more than one statement inside the lambda expression, we should use {} and end with semicolon {---};

    }

    public static void print(Shape shape){
        shape.draw();
    }
}
