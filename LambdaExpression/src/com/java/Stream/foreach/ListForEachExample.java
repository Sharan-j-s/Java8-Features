package com.java.Stream.foreach;

import java.util.ArrayList;
import java.util.List;

public class ListForEachExample {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();
        list.add(new Person("Tony",29));
        list.add(new Person("Sharath",22));
        list.add(new Person("Manoj",35));
        list.add(new Person("Vijay",23));

        // prior Java 8
        for (Person person : list)
            System.out.println(person.getName()+" "+person.getAge());

        // Java 8 forEach method
        list.forEach((person -> System.out.println(person.getName()+" "+person.getAge())));

        // using stream
        list.stream().forEach((person -> System.out.println(person.getName()+" "+person.getAge())));


    }
}

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
