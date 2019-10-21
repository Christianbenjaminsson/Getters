package com.example.getters;

public class Getters {
    public static void main(String[] args) {
        Employees newEmployee = new Employees("Sara", 12345);
        System.out.println("Name of new employee is " + newEmployee.getName() + " with securityNumber " +
                newEmployee.getSecurityNumber());
    }
}
