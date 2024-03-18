package ru.mpei.lec3;

import ru.mpei.lec3.impl.Iec104DataReceiver;
import ru.mpei.lec3.impl.ModbusDataReceiver;

public class DataStorage {
    public DataStorage(DataReceiver dataReceiver) {
        this.dataReceiver = dataReceiver;
    }

    private double[] measurements;
    private DataReceiver dataReceiver;

    public void receive(){
        double[] data = dataReceiver.receive();
        for (int i = 0; i < measurements.length; i++) {
            measurements[i] = data[i];
        }
    }


}
