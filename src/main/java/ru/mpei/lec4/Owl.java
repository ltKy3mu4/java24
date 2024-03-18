package ru.mpei.lec4;

public class Owl extends Animal{

    public Owl() {
        this.name = AnimalType.Owl;
        this.color="brown";
        this.pawsCount = 2;
    }

    @Override
    public boolean canFly() {
        return true;
    }

    @Override
    protected String whatDoesTheAnimalSay() {
        return "Uh uh uh";
    }
}
