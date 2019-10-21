package com.example.getters;

public class Employees {

    private String name;
    private int securityNumber;

    public Employees(String name, int securityNumber) {
        this.name = name;
        this.securityNumber = securityNumber;
    }

    public String getName() {
        return name;
    }

    public int getSecurityNumber() {
        return securityNumber;
    }
}
