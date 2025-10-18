package org.example.DesignPatterns.Problem3.betterCode;

public class Character implements Cloneable {
    String name;
    int health;
    int strength;
    int level;

    public Character(String name, int health, int strength, int level) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.level = level;
    }

    @Override
    public Character clone() throws CloneNotSupportedException {
        return (Character) super.clone();
    }

}
