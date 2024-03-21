package ru.mpei.lec7.protocols;

import ru.mpei.lec7.Bean;

@Bean(name = "iec104")
public class Iec104DataExchanger implements DataExchanger{
    private int byteOrder;

    @Override
    public boolean setValue(String tag, double value) {
        return false;
    }

    @Override
    public double getValue(String tag) {
        return 0;
    }
}
