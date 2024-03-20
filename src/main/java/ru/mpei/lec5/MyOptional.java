package ru.mpei.lec5;

public class MyOptional <T> {

    private T receiver;

    private MyOptional(T receiver) {
        this.receiver = receiver;
    }

    public boolean isEmpty(){
        return receiver != null;
    }

    public T get(){
        if (receiver != null){
            return receiver;
        } else {
            throw new RuntimeException("CHECK EMPTY!!!!!");
        }
    }

    public static <T> MyOptional<T> of(T r){
        return new MyOptional<>(r);
    }

    public static <T> MyOptional<T> empty(){
        return new MyOptional<>(null);
    }

}
