package com.example.task23;

public class Human {
    private int strength ;
    private int stealth ;
    private int intelligence ;
    private int health  ;

    public Human(int strength, int stealth, int intelligence, int health) {
        this.strength = strength;
        this.stealth = stealth;
        this.intelligence = intelligence;
        this.health = health;
    }

    public Human() {
        this.strength = 3;
        this.stealth = 3;
        this.intelligence = 3;
        this.health = 100;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStealth() {
        return stealth;
    }

    public void setStealth(int stealth) {
        this.stealth = stealth;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int attack(Human human) {
         human.setHealth(human.getHealth()+this.getStrength());
         return human.getHealth() ;
    }
}
