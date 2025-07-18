package com.bridgelabz.observorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class YouTubeImpl implements YouTube
{
    List<Subscriber> subscribers=new ArrayList<>();


    @Override
    public void subscribe(Subscriber sb) {
     this.subscribers.add(sb);
    }

    @Override
    public void unSubscribe(Subscriber sb) {
        this.subscribers.remove(sb);



    }

    @Override
    public void notifyChange() {
        for (Subscriber s : this.subscribers) {
            s.notified();
        }
    }
}
