package com.bridgelabz.singletonDesignPattern;

public class LadooMain {
        public static void main(String[] args) {

            // First thread
            Thread t1 = new Thread(() -> {
                Ladoo obj1 = Ladoo.getLadoo();
                System.out.println("Thread 1: " + obj1.hashCode());
            });

            // Second thread
            Thread t2 = new Thread(() -> {
                Ladoo obj2 = Ladoo.getLadoo();
                System.out.println("Thread 2: " + obj2.hashCode());
            });

            // Start both threads
            t1.start();
            t2.start();
        }
    }


