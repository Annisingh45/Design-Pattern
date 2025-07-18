package com.bridgelabz.observorDesignPattern;

public class SubscriberImpl implements Subscriber{
    public String name;
    public SubscriberImpl(String name)
    {
        this.name=name;
    }
    @Override
    public void notified() {
        System.out.println("Hello "+this.name+" New video uploaded goooo and watch itt");
    }
}
