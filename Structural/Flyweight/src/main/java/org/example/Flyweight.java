package org.example;

public class Flyweight {

    public static void main(String[] args) {

        Bullet bullet = Bullet.getBullet(BulletType.FAST);
        Bullet bullet1 = Bullet.getBullet(BulletType.FAST);
        Bullet bullet2 = Bullet.getBullet(BulletType.FAST);
        Bullet bullet3 = Bullet.getBullet(BulletType.FAST);
        
        System.out.println("Hello world!");
    }
}