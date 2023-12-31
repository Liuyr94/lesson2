package com.bessonov.lesson2.enumeration;

public class Calendar {
    Month month = Month.AVGUST;

    public void currentDateInfo() {
        System.out.println(month.getNumberMonth() + " " + month.getNumberMonth());
    }
}
