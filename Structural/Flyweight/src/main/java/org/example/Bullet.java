package org.example;

import java.util.HashMap;
import java.util.Map;

public class Bullet {

    static Map<BulletType, Bullet> bullets = new HashMap<>();

    public static Bullet getBullet(BulletType type) {
        Bullet bullet = bullets.get(type);
        if (bullet == null) {
            bullet = new Bullet(type);
            bullets.put(type, bullet);
        }
        return bullet;
    }

    BulletType type;

    public Bullet(BulletType type) {
        this.type = type;
    }
}
