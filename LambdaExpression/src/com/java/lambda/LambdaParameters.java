package com.java.lambda;

interface Addable{
    int addition(int a, int b);
}

//traditional programming
class AddableImpl implements Addable{

    @Override
    public int addition(int a, int b) {
        return (a+b);
    }
}

public class LambdaParameters {
    public static void main(String[] args) {
        //functional programming

        /*Addable addition =  (int a, int b) -> {
            return (a+b);
        }; */

        // removed data type and we an get rid of return statement also, if we have only one statement
           //Addable add = (a,b) -> (a+b);
           //int res = add.addition(10,20);
           //System.out.println(res);

        //if there are multiple statements
        Addable add = (a,b) -> {
            int c = a+b;
            return c;
        };
        int res = add.addition(20,25);
        System.out.println(res);
    }
}
