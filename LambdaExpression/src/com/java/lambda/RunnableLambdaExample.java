package com.java.lambda;

// Using lambda expression to implement runnable interface

class ThreadDemo implements  Runnable{

    @Override
    public void run() {
        System.out.println("Run method called...");
    }
}



public class RunnableLambdaExample {
    public static void main(String[] args) {
            // Traditional program
            Thread thread = new Thread(new ThreadDemo());
            thread.start();

        //functional program
        // Runnable runnable = () -> System.out.println("Run method called using lambda expression...");
            Thread threadLambda = new Thread(() -> System.out.println("Run method called using lambda expression..."));
            threadLambda.start();
    }
}
