package com.java.Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSorting {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        // Converting fruit list to stream, then sort it using comparator(naturalOrder -> ascending), at the end converting stream to list
        List<String> sortedList = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(sortedList);

        // by using lambda expression
        List<String> sortedList2 = fruits.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList());
        System.out.println(sortedList2);

        // If we don't pass any parameter to the sorted function, by default it will sort in ascending
        List<String> sortedList3 = fruits.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList3);


        System.out.println("------------------------------------------");


        // Descending order
        List<String> sortedList4 = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedList4);

        // by using lambda expression
        List<String> sortedList5 = fruits.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());
        System.out.println(sortedList5);

        System.out.println("-------------------------------------------");

        // Sort employee by salary in ascending order

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(10,"Ramesh",30, 400000L));
        employees.add(new Employee(20,"Suresh",26,250000L));
        employees.add(new Employee(30,"Rakesh",30,600000L));
        employees.add(new Employee(22,"Kiran",22,340000L));

        List<Employee> employeeSortedList = employees.stream().sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getSalary() - o2.getSalary());
            }
        }).collect(Collectors.toList());
        System.out.println(employeeSortedList);

        // using lambda expression
        List<Employee> employeeSortedList2 = employees.stream().sorted((o1, o2) -> (int)(o1.getSalary() - o2.getSalary())).collect(Collectors.toList());
        System.out.println(employeeSortedList2);

        System.out.println("--------------------------------------------");

        // Descending order

        List<Employee> employeeSortedList3 = employees.stream().sorted((o1, o2) -> (int)(o2.getSalary() - o1.getSalary())).collect(Collectors.toList());
        System.out.println(employeeSortedList3);

        // Instead of lambda expression we can also use comparator provided methods, by default it will print in ascending order
        // Inorder to make it descending i've used the reversed() method.
        List<Employee> employeeSortedList4 = employees.stream().sorted(Comparator.comparingLong(Employee::getSalary).reversed()).collect(Collectors.toList());
        System.out.println(employeeSortedList4);


        System.out.println("-----------------------------------------");

        // sorting by employeeAge
        List<Employee> employeeSortedList5 = employees.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).collect(Collectors.toList());
        System.out.println(employeeSortedList5);

        // Same thing goes for everything, employeeid, name, age whatever it is.

    }
}
