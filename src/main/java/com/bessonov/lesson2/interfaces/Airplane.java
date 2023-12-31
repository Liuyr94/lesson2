package com.bessonov.lesson2.interfaces;

public class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Самолёт летит !");
    }
}
