package ru.mpei.lec3;

import ru.mpei.lec3.impl.Iec104DataReceiver;
import ru.mpei.lec3.impl.ModbusDataReceiver;

public class Main {
    public static void main(String[] args) {
        Table t = new Table();
        t.setHeight(20.4);
        t.setColor("red");

        Chair c1 = new Chair();
        c1.setHeight(17.2);
        c1.setLength(10);
        c1.setWidth(20);

        Table t2 = new Table(100, 20, 40);

        double height = t2.getHeight();
        System.out.println(height);

        System.out.println(t2.getLength());

        printSize(t2);
        printSize(c1);

        Table[] tables = new Table[2];
        tables[0] = t2;
//        tables[1] = c1;

        Thing[] things = new Thing[2];
        things[0] = t2;
        things[1] = c1;


        for (Thing thing : things) {
            System.out.println(thing);
        }


        DataStorage ds = new DataStorage(new ModbusDataReceiver());

    }

    public static void printSize(Thing t){
        System.err.println(t.getLength()+ " * " + t.getWidth() + " * "+ t.getHeight());
    }

//    public static void printSizeTable( Table t){
//        System.err.println(t.getLength()+ " * " + t.getWidth() + " * "+ t.getHeight());
//    }
//
//    public static void printSizeChair( Chair t){
//        System.err.println(t.getLength()+ " * " + t.getWidth() + " * "+ t.getHeight());
//    }
}
