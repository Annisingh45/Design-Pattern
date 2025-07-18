package com.bridgelabz.observorDesignPattern;

public interface Subject {
    void subscribe(Observer ob);
    void unSubscribe(Observer ob);
    void notifyChange();

}
