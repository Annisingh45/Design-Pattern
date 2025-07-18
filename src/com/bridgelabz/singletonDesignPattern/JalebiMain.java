package com.bridgelabz.singletonDesignPattern;

public class JalebiMain {
    public static void main(String[] args) {
        Jalebi jalebi=Jalebi.getJalebi();
        Jalebi jalebi1=Jalebi.getJalebi();
        Jalebi jalebi2=Jalebi.getJalebi();

        System.out.println(jalebi.hashCode());
        System.out.println(jalebi1.hashCode());
        System.out.println(jalebi2.hashCode());
    }
}
