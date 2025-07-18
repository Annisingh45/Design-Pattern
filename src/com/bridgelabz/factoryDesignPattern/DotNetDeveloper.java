package com.bridgelabz.factoryDesignPattern;

public class DotNetDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("Dot Net developer salary is::");
        return 600000;
    }
}
