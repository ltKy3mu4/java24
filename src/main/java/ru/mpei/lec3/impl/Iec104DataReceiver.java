package ru.mpei.lec3.impl;

import ru.mpei.lec3.DataReceiver;

public class Iec104DataReceiver implements DataReceiver {
    @Override
    public double[] receive() {
        System.out.println("recieved data from iec 104 client");
        return new double[]{10,20,30};
    }
}
