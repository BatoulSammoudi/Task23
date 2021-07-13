package com.example.task23;

public class Samurai extends Human {
    int counter = 0 ;
    public Samurai() {
        this.setHealth(200);
        counter++ ;
    }

    public Samurai(int strength, int stealth, int intelligence, int health) {
        super(strength, stealth, intelligence, health);
        counter++ ;
    }

    public int deathBlow(Human human) {
        human.setHealth(0);
        this.setHealth(this.getHealth() / 2);
        return this.getHealth();
    }
    public int meditate () {
        this.setHealth(this.getHealth()*2);
        return this.getHealth();
    }
    public int howMany() {
        return counter ;
    }
}
