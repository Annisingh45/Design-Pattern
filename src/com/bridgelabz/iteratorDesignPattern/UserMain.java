package com.bridgelabz.iteratorDesignPattern;

import com.bridgelabz.factoryDesignPattern.WebDeveloper;

public class UserMain {
    public static void main(String[] args) {


        UserManagement userManagement = new UserManagement();
        userManagement.addUser(new User(11, "Anni"));
        userManagement.addUser(new User(12, "Khushi"));
        userManagement.addUser(new User(13, "Nitish"));
        userManagement.addUser(new User(14, "Lisa"));

        MyIterator myIterator=userManagement.getIterator();
        while (myIterator.hashNext())
        {
            User user= (User) myIterator.next();
            System.out.println(user.getUserName());
        }
    }
}
