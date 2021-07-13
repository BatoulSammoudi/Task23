package com.example.task23;

public class Wizard extends Human {
    static int decreaseHealth = 3;

    public Wizard() {
        this.setHealth(50);
        this.setIntelligence(8);
    }

    public Wizard(int strength, int stealth, int intelligence, int health) {
        super(strength, stealth, intelligence, health);
    }

    public int heal(Human human) {
        human.setHealth(human.getHealth() + this.getIntelligence());
        return human.getHealth();
    }

    public int fireball(Human human) {
        human.setHealth(human.getHealth() + (this.getIntelligence() * decreaseHealth));
        return human.getHealth();
    }
}
