package com.example.task23;

public class Ninja extends Human {
    static int decreaseAmoount = 10;

    public Ninja() {
        this.setStealth(10);
    }

    public Ninja(int strength, int stealth, int intelligence, int health) {
        super(strength, stealth, intelligence, health);
    }

    public int steal(Human human) {
        human.setHealth(human.getHealth() - this.getStealth());
        this.setHealth(human.getHealth());
        return this.getHealth();
    }

    public int runaway() {
        this.setHealth(this.getHealth() - decreaseAmoount);
        return this.getHealth();
    }
}
