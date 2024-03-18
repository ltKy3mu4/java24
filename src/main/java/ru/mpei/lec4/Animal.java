package ru.mpei.lec4;

public abstract class Animal {
    protected int pawsCount;
    protected String color;
    protected AnimalType name;

    public abstract boolean canFly();

    protected abstract String whatDoesTheAnimalSay();
    public void say(){
        System.out.println(name + " say : " + this.whatDoesTheAnimalSay());
    }
}
