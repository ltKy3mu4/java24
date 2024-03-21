package ru.mpei.lec7.protocols;

public interface DataExchanger {

    boolean setValue(String tag, double value);

    double getValue(String tag);
}
