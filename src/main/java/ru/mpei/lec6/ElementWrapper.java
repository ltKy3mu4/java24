package ru.mpei.lec6;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ElementWrapper <E> {
    private E element;
    private ElementWrapper<E> next;
    private ElementWrapper<E> prev;

    public boolean hasNext(){
        return next != null;
    }

    @Override
    public String toString() {
        return "ElementWrapper{" +
                "element=" + element +
                ", next=" + (next!=null) +
                ", prev=" + (prev!=null) +
                '}';
    }
}
