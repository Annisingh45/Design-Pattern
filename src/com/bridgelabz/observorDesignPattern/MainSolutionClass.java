package com.bridgelabz.observorDesignPattern;

public class MainSolutionClass {
    public static void main(String[] args) {
        YouTubeImpl  youTube=new YouTubeImpl();
        SubscriberImpl subscriber1=new SubscriberImpl("Anni");
        SubscriberImpl subscriber2=new SubscriberImpl("khushi");
        SubscriberImpl subscriber3=new SubscriberImpl("Nitish");
        SubscriberImpl subscriber4=new SubscriberImpl("Lisa");
        youTube.subscribe(subscriber1);
        youTube.subscribe(subscriber2);
        youTube.subscribe(subscriber3);
        youTube.subscribe(subscriber4);



        youTube.notifyChange();

    }
}
