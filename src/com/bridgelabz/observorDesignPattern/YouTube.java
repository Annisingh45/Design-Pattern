package com.bridgelabz.observorDesignPattern;

interface YouTube {
    void subscribe(Subscriber ob);
    void unSubscribe(Subscriber ob);
    void notifyChange();

}
