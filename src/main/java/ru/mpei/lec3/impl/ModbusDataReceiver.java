package ru.mpei.lec3.impl;

import ru.mpei.lec3.DataReceiver;

public class ModbusDataReceiver implements DataReceiver {

    public double[] receive(String modbus){
        return new double[]{1,2,3};
    }

    @Override
    public double[] receive() {
        return this.receive("id-modbus");
    }
}
