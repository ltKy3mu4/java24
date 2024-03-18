package ru.mpei.lec4;

public class Fox extends Animal{

    public Fox() {
        this.pawsCount = 4;
        this.name = AnimalType.Fox;
        this.color = "Orange";
    }

    @Override
    public boolean canFly() {
        return false;
    }

    @Override
    protected String whatDoesTheAnimalSay() {
        return "fr fr fr";
    }
}
