package com.bridgelabz.builderPattern;

public class UserMain {
        public static void main(String[] args) {
            // Only required field
            User user1 = new User.Builder(1).build();

            // All fields
            User user2 = new User.Builder(2)
                    .setUserName("Anni Singh")
                    .setUserAddress("Lucknow")
                    .build();

            System.out.println(user1);
            System.out.println(user2);
        }
    }


