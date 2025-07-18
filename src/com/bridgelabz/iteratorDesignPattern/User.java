package com.bridgelabz.iteratorDesignPattern;

public class User {
    int useId;
    String userName;

    public User(int useId, String userName) {
        this.useId = useId;
        this.userName = userName;
    }

    public int getUseId() {
        return useId;
    }

    public void setUseId(int useId) {
        this.useId = useId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
