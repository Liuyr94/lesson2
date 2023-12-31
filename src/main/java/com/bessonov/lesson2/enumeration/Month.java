package com.bessonov.lesson2.enumeration;

public enum Month {
    JANUARY(1), FEBRUARY(2), MARCH(3), APRIL(4), MAY(5), JUNE(6),
    JULY(7), AVGUST(8), SEPTEMBER(9), OCTOBER(10), NOVEMBER(11),
    DECEMBER(12);

    int numberMonth;

    public int getNumberMonth() {
        return numberMonth;
    }

    Month(int number) {

    }
}
