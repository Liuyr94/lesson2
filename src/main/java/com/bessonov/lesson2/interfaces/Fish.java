package com.bessonov.lesson2.interfaces;

public class Fish implements Swimable {
    @Override
    public void swim() {
        System.out.println("Рыба плывет");
    }
}
