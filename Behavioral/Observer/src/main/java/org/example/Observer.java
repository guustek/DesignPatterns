package org.example;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Observer {

    public static void main(String[] args) throws InterruptedException {

        EventManager_Publisher publisher = new EventManager_Publisher();
        WowSubscriber e = new WowSubscriber();
        publisher.getSubscribers().add(e);
        publisher.getSubscribers().add(new WowSubscriber());
        publisher.getSubscribers().add(new WowSubscriber());
        publisher.getSubscribers().add(new WowSubscriber());
        new Thread(publisher).start();
        Thread.sleep(2000);

        publisher.getSubscribers().remove(e);

        publisher.getSubscribers().add(new Subscriber() {
            @Override
            public void update() {
                System.out.println("ANONYM");
            }
        });
    }
}