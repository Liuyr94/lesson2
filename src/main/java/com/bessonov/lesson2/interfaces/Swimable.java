package com.bessonov.lesson2.interfaces;

public interface Swimable {
    default void swim() {
        System.out.println("Плывем");
    }
}
