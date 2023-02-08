package org.example;

import java.util.ArrayList;
import java.util.List;

public class EventManager_Publisher implements Runnable {

    private List<Subscriber> subscribers = new ArrayList<>();

    private void notifyObservers(){
        subscribers.forEach(sub -> sub.update());
    }

    public List<Subscriber> getSubscribers() {
        return subscribers;
    }

    @Override
    public void run() {
        for (int i = 0;; i++) {
            System.out.println(i);
            if(i%100==1){
                notifyObservers();
            }
        }
    }
}
