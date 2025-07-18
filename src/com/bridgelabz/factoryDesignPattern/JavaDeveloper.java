package com.bridgelabz.factoryDesignPattern;

public class JavaDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("Java Developer salary is::");
        return 1000000;
    }
}
