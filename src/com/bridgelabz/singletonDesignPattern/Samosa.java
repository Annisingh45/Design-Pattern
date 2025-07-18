package com.bridgelabz.singletonDesignPattern;
//This code is implementing the Singleton Design Pattern in Java using lazy initialization.
public class Samosa {
    static  Samosa samosa;
    private Samosa(){

    }
    public static Samosa getSamosa(){
        if(samosa==null)
        {
            samosa =new Samosa();
        }
        return samosa;
    }
}
