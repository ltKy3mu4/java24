package ru.mpei.lec6;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyEasyLinkedList<Type> implements List<Type> {
    private ElementWrapper<Type> first = null;
    private ElementWrapper<Type> last = null;

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        if (first == null){
            return false;
        }
        ElementWrapper<Type> current = first;
        while (current.hasNext()){
            if (current.getElement().equals(o)){
                return  true;
            } else {
                current = current.getNext();
            }
        }
        return false;
    }

    @Override
    public Iterator<Type> iterator() {
        return new Iterator<Type>() {
            ElementWrapper<Type> current = first;
            @Override
            public boolean hasNext() {
//                if (current != null && current.hasNext()){
//                    return true;
//                } else {
//                    return false;
//                }
                return current != null;
            }

            @Override
            public Type next() {
                Type val = current.getElement();
                current = current.getNext();
                return val;
            }
        };
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Type value) {
        if (first == null){
            first = new ElementWrapper<>(value, null, null);
            last = first;
        } else {
            ElementWrapper<Type> newEl = new ElementWrapper<>(value, null, null);
            last.setNext(newEl);
            newEl.setPrev(last);
            last = newEl;
        }
        return true;
    }

    @Override
    public boolean remove(Object o) {


        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Type> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Type> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Type get(int index) {
        ElementWrapper<Type> required = first;
        for(int i =0; i < index; i++){
            required = required.getNext();
        }
        return required.getElement();
    }

    @Override
    public Type set(int index, Type element) {
        return null;
    }

    @Override
    public void add(int index, Type element) {

    }

    @Override
    public Type remove(int index) {
        ElementWrapper<Type> required = first;
        for(int i =0; i < index; i++){
            required = required.getNext();
        }

        if (required.getPrev() != null && required.getNext()!= null){
            required.getPrev().setNext(required.getNext());
            required.getNext().setPrev(required.getPrev());
        } else if (required.getPrev() != null) {
            required.getPrev().setNext(null);
            last = required.getPrev();
        } else if (required.getNext() != null) {
            required.getNext().setPrev(null);
            first = required.getNext();
        } else {
            first = null;
            last = null;
        }


        return required.getElement();
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Type> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Type> listIterator(int index) {
        return null;
    }

    @Override
    public List<Type> subList(int fromIndex, int toIndex) {
        return null;
    }
}
