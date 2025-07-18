package com.bridgelabz.singletonDesignPattern;

//This code is implementing the Singleton Design Pattern in Java using eager initialization.
public class Jalebi {
    private static Jalebi jalebi =new Jalebi();

    public static Jalebi getJalebi()
    {
        return jalebi;
    }
}
