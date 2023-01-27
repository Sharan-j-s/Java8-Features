package com.java.lambda.defaultstatic;

// The methods which are declared as default can be used in all other methods without need of overriding it (provides backward compatability)
// Because we have already provided the implementation to the default methods in the interface itself, so no need of overriding it again
// But for abstract methods, we need to override it in each class if we are implementing Vehicle interface.
// Like regular interface methods, default methods are implicitly public, no need to explicitly define them as public.

interface Vehicle{
    String getBrand();

    String speedUp();

    String slowDown();

    default String turnAlarmOn(){
        return "turning vehicle alarm on";
    }

    default String turnAlarmOff(){
        return "turning vehicle alarm off";
    }

    static String getCompany(){
        return "Company is BMW";
    }
}

class Car implements Vehicle{

    @Override
    public String getBrand() {
        return "BMW";
    }

    @Override
    public String speedUp() {
        return "The car is speeding up";
    }

    @Override
    public String slowDown() {
        return "The car is slowing down";
    }
}

public class DefaultDemo {
    public static void main(String[] args) {

        Vehicle vehicle = new Car();
        //Car vehicle = new Car(); we can also do this

        System.out.println(vehicle.getBrand());
        System.out.println(vehicle.speedUp());
        System.out.println(vehicle.slowDown());

        // automatically available to its implementation class
        System.out.println(vehicle.turnAlarmOn());
        System.out.println(vehicle.turnAlarmOff());

        // Inorder to call static method, we can directly use interface name, just like we use class name to call static methods when its define in a class
        System.out.println(Vehicle.getCompany());

    }

}
