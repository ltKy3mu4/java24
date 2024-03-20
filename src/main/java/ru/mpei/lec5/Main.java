package ru.mpei.lec5;

import ru.mpei.Student;
import ru.mpei.lec3.DataReceiver;
import ru.mpei.lec3.impl.FileDataReceiver;
import ru.mpei.lec3.impl.Iec104DataReceiver;
import ru.mpei.lec3.impl.ModbusDataReceiver;
import ru.mpei.lec4.Fox;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Student[] sts = new Student[10];
        sts[0] = new Student("dsa", 1, "das");

        List students = new ArrayList();
        for (int i=0; i < 1000; i++){
            students.add(new Student("valera", 20, "e-13"+i));
        }
        students.add(new Fox());
        students.remove(1000);

        for (int j = 0; j < students.size(); j++) {
            Object o = students.get(j);
            Student st = (Student) o;
            System.out.println(st.getSurname());
        }

        List<DataReceiver> receivers = new ArrayList<>();
//        receivers.add(new Fox());
        receivers.add(new FileDataReceiver());
        receivers.add(new Iec104DataReceiver());
        receivers.add(new ModbusDataReceiver());

//        MyOptional fileRec = createByType("file");
//        if (!fileRec.isEmpty()){
//            DataReceiver dr =(DataReceiver) fileRec.get();
//            System.out.println(dr.receive());
//        }
//        MyOptional iec103Roc = createByType("iec103");
//        if (iec103Roc != null){
//            System.out.println(iec103Roc.receive());
//        }
//
//        MyOptional myOptional = MyOptional.of(new FileDataReceiver());
        MyOptional<DataReceiver> file = createByType("file");
        DataReceiver dataReceiver = file.get();

        MyOptional<Student> randomStudent = getRandomStudent();
    }

    public static MyOptional<Student> getRandomStudent(){
        Random r = new Random();
        boolean empty = r.nextBoolean();
        if (empty){
            return MyOptional.empty();
        } else {
            return MyOptional.of(new Student("random", r.nextInt(), "e-13-"+r.nextInt()));
        }
    }

    public static MyOptional<DataReceiver> createByType(String type){
        switch (type){
            case "file": return MyOptional.of(new FileDataReceiver());
            case "iec104": return MyOptional.of(new Iec104DataReceiver());
            case "modbus": return MyOptional.of(new ModbusDataReceiver());
        }
        return MyOptional.empty();
    }
}
