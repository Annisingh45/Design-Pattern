package com.bridgelabz.singletonDesignPattern;

public class Ladoo {



        // Step 1: Declare the instance as private and static
        private static Ladoo ladoo;

        // Step 2: Private constructor to prevent external instantiation
        private Ladoo() {
        }

        // Step 3: Public method to return the single instance
        public static Ladoo getLadoo() {
            // First check (without locking) - performance improvement
            if (ladoo == null) {
                // Only one thread can enter this block at a time
                synchronized (Ladoo.class) {
                    // Second check (inside synchronized block)
                    if (ladoo == null) {
                        ladoo = new Ladoo(); // Create the instance
                    }
                }
            }
            return ladoo;
        }
    }


