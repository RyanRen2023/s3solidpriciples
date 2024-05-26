package com.algonquin.cst8288.assignment1.emoloyee;

public class Employee {

    private String name;
    private String email;
    private String address;
    private double salary;

    public Employee() {
        // Default constructor
    }

    public Employee(String name, String email, String address, double salary) {
        if (salary <= 0) {
            throw new IllegalArgumentException("Salary should be greater than 0!");
        }
        this.name = name;
        this.email = email;
        this.address = address;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary <= 0) {
            throw new IllegalArgumentException("Salary should be greater than 0!");
        }
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", email=" + email + ", address=" + address + ", salary=" + salary + "]";
    }

}
