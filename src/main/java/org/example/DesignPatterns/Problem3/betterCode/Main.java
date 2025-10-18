package org.example.DesignPatterns.Problem3.betterCode;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        CharacterFactory characterFactory = new CharacterFactory();
        Character warrior = characterFactory.createWarrior();
        Character mage = characterFactory.createMage();
        Character archer = characterFactory.createArcher();
    }
}
