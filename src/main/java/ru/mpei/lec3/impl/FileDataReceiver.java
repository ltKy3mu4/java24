package ru.mpei.lec3.impl;

import ru.mpei.lec3.DataReceiver;

import java.io.File;

public class FileDataReceiver implements DataReceiver {
    private double[] data;
    @Override
    public double[] receive() {
        File f= new File("data.txt");

        return new double[0];
    }
}
