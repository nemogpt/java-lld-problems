package org.example.DesignPatterns.Problem3.problematicCode;

public class CharacterFactory {

    public Character createWarrior() {
        return new Character("Warrior", 100, 100, 1);
    }

    public Character createMage() {
        return new Character("Mage", 100, 100, 2);
    }

    public Character createArcher() {
        return new Character("Archer", 100, 100, 3);
    }
}
