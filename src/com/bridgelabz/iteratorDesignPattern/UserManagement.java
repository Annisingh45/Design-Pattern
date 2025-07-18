package com.bridgelabz.iteratorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class UserManagement {

    List<User> userList=new ArrayList<>();

    public void addUser(User user)
    {
        userList.add(user);

    }

    public User getUser(int in) {
        return userList.get(in);
    }

    public MyIterator getIterator()
    {
        return new MyIteratorImpl(userList);
    }
}
