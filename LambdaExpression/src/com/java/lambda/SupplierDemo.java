package com.java.lambda;

import java.time.LocalDateTime;
import java.util.function.Supplier;

// Supplier interface doesn't take any input but returns output

/*
class SupplierImpl implements Supplier{

    @Override
    public Object get() {
        return true;
    }
}

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Boolean> sup = new SupplierImpl();
        System.out.println(sup.get());
    }
 */

// this code will return the current date & time

class SupplierImpl implements Supplier<LocalDateTime>{

    @Override
    public LocalDateTime get() {
        return LocalDateTime.now();
    }
}


public class SupplierDemo{
    public static void main(String[] args) {
        Supplier<LocalDateTime> sup = new SupplierImpl();
        System.out.println(sup.get());

        //using lambda expression
        Supplier<LocalDateTime> sp = () -> LocalDateTime.now();
        System.out.println(sp.get());
    }
}
