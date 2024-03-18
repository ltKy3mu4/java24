package ru.mpei;

public class Student {
    private String surname;
    private int age = 15;
    private String group;
    private double averageMark;

    public Student(String surname, int age, String group, double averageMark) {
        this.surname = surname;
        this.age = age;
        this.group = group;
        this.averageMark = averageMark;
    }

    public Student(String surname, int age, String group) {
        this.surname = surname;
        this.age = age;
        this.group = group;
    }

    public Student() {
    }

    public void setAge(int age) {
        if (age > 0 && age < 150) {
            this.age = age;
        } else {
            System.err.println("Wrong age was set. It has to be limit by 0 and 150");
        }
    }

    public int getAge() {
        return this.age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public boolean isSkuf() {
        if (age > 35) {
            return true;
        } else {
            return false;
        }
    }




}
