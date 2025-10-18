package org.example.DesignPatterns.Problem3.betterCode;

public class CharacterFactory {
    private Character prototypeCharacter= new Character("Default", 100, 100, 1);

    public Character createWarrior() throws CloneNotSupportedException {
        Character warrior = prototypeCharacter.clone();
        warrior.name = "Warrior";
        warrior.level = 1;
        return warrior;
    }

    public Character createMage() throws CloneNotSupportedException {
        Character mage = prototypeCharacter.clone();
        mage.name = "Mage";
        mage.level = 2;
        return mage;
    }

    public Character createArcher() throws CloneNotSupportedException {
        Character archer = prototypeCharacter.clone();
        archer.name = "Archer";
        archer.level = 3;
        return archer;
    }
}
