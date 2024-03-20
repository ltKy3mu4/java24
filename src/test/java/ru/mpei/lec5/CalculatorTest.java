package ru.mpei.lec5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void addTest1(){
        Calculator c = new Calculator();
        double res = c.add(2.0, 3.0);
        Assertions.assertEquals(5.0, res);
    }

}