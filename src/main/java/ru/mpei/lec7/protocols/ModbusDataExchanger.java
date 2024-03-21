package ru.mpei.lec7.protocols;

import ru.mpei.lec7.Bean;

import java.util.HashMap;
import java.util.Map;

@Bean(name = "modbus")
public class ModbusDataExchanger implements DataExchanger{
    private Map<String, Double> data = new HashMap<>();
    @Override
    public boolean setValue(String tag, double value) {
        data.put(tag,value);
        return true;
    }

    @Override
    public double getValue(String tag) {
        if (data.containsKey(tag)){
            return data.get(tag);
        } else {
            return 0;
        }
    }
}
