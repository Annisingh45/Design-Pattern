package com.bridgelabz.factoryDesignPattern;

public class WebDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("Web Developer salary is::");
        return 50000;
    }
}
