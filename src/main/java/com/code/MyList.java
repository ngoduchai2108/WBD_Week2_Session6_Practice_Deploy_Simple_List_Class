package com.code;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object [] elements;

    MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapa(){
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements,newSize);
    }
    //Method add()
    void add(E e){
        if (size == elements.length){
            ensureCapa();
        }
        elements[size++] = e;
//        size++;
    }
    //Method get()
    E get(int i){
        if (i>=size || i<0){
            throw new IndexOutOfBoundsException("Index "+i+",Size "+i);
        }
        return (E) elements[i-1];
    }

}
