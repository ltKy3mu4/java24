package ru.mpei.lec4;

import ru.mpei.Student;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) {
        String s = readInitialConfig(args[0]);




//        Student s1 = new Student();
        Animal fox = new Fox();
        Animal dog = new Dog();
        Animal owl = new Owl();

        Animal[] animals = new Animal[5];
        animals[0] = fox;
        animals[1] = dog;
        animals[2] = owl;

        for (int i=0; i < animals.length; i++) {
            if (animals[i] != null){
                System.out.println(animals[i].whatDoesTheAnimalSay());
            }
        }

        int a = 2000000;
        long b = 2;
        b = a;
        System.out.println(b);

        if (fox instanceof Fox){
            System.out.println("fox");
        }

        if (fox instanceof Dog){
            System.out.println("dog");
        }

        if (fox instanceof  Animal) {
            System.out.println("animal");
        }
        filterDog(animals);

        System.out.println(AnimalType.Fox.ordinal());
        System.out.println(AnimalType.Fox.name());

        if (fox.name == dog.name){
            System.out.println("equals");
        }


        fox = null;

        try {
            System.out.println(fox.name);
        } catch (Exception e){
            e.printStackTrace();
        }

        String content = null;
        try {
            content = Files.readString(Path.of("src/main/resources/ParsingData2.txt"), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
            content = "No file found";
        }

        System.out.println(content);


//        int sum = 10 / 0;
//        System.out.println(sum);

        System.err.println("Program finished");
    }



    public static void filterDog(Animal[] animals){
        for (Animal animal : animals) {
            if (animal == null) continue;
            if (animal instanceof  Dog){
//            if (animal.getClass().equals(Dog.class)){
                Dog d = (Dog) animal;
                d.runForTail();
            }
        }
    }


    public static  String readInitialConfig(String path){
        String cfg;
        try {
            cfg = Files.readString(Path.of(path), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Can not read cfg file by path "+path+". Hence, program can not be started.");
        }
        return cfg;
    }
}
