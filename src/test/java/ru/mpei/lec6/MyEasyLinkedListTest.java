package ru.mpei.lec6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MyEasyLinkedListTest {

    @Test
    public void addElTest1(){
        List<String> l = new MyEasyLinkedList<>();
        l.add("first");
        l.add("second");
        l.add("third");

        Assertions.assertEquals("first", l.get(0));
        Assertions.assertEquals("second", l.get(1));
        Assertions.assertEquals("third", l.get(2));
    }


    @Test
    public void removeELTest1(){
        List<String> l = new MyEasyLinkedList<>();
        l.add("first");
        l.add("second");
        l.add("third");
        l.add("forth");

        String remove = l.remove(2);
        Assertions.assertEquals("third", remove);
        Assertions.assertEquals("second", l.get(1));
        Assertions.assertEquals("forth", l.get(2));
    }

    @Test
    public void removeELTest2(){
        List<String> l = new MyEasyLinkedList<>();
        l.add("first");
        l.add("second");
        l.add("third");
        l.add("forth");

        String remove = l.remove(3);
        Assertions.assertEquals("forth", remove);
        Assertions.assertEquals("second", l.get(1));
        Assertions.assertEquals("third", l.get(2));
    }

    @Test
    public void removeELTest3(){
        List<String> l = new MyEasyLinkedList<>();
        l.add("first");
        l.add("second");

        l.remove(0);
        l.remove(0);

        l.add("third");
        Assertions.assertEquals("third", l.get(0));
    }

    @Test
    public void containsTest(){
        List<String> l = new MyEasyLinkedList<>();
        l.add("first");
        l.add("second");
        l.add("third");
        l.add("forth");

        Assertions.assertTrue(l.contains("second"));
        Assertions.assertFalse(l.contains("fifth"));
    }

    @Test
    public void containsTest2(){
        List<String> l = new MyEasyLinkedList<>();
        Assertions.assertFalse(l.contains("fifth"));
    }

    @Test
    public void iterTest(){
        List<String> l = new MyEasyLinkedList<>();
        l.add("first");
        l.add("second");
        l.add("third");
        l.add("forth");

        int count =0;
        Iterator<String> iterator = l.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            count++;
        }


        Assertions.assertEquals(4, count);

    }

}