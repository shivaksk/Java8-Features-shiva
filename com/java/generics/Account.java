package com.java.generics;

public class Account<T> {
    T type;

    public Account(T obj) {
        this.type = obj;
    }

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }

    public void print() {
        System.out.println("Generic Class: " + type.getClass().getName());
    }
}
