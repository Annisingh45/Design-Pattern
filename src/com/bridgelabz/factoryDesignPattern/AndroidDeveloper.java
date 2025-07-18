package com.bridgelabz.factoryDesignPattern;

public class AndroidDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("Android Developer salary is::");
        return 700000;
    }
}
