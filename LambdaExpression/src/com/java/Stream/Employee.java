package com.java.Stream;

// This class is created to be used in StreamListSorting.java file

public class Employee {
    private int empId;
    private String empName;
    private int age;
    private Long salary;

    public Employee(int empId, String empName, int age, Long salary) {
        this.empId = empId;
        this.empName = empName;
        this.age = age;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
