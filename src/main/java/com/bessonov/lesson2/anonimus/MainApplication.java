package com.bessonov.lesson2.anonimus;

public class MainApplication {
    class Inner {
        int innerValue;

        public Inner(int innerValue) {
            this.innerValue = innerValue;
        }

        public void innerMethod() {
            System.out.println(innerValue);
            System.out.println(outerValue);
            //outerMethod();
        }
    }


    int outerValue;

    public void outerMethod() {
        System.out.println(outerValue);
        Inner inner = new Inner(10);
    }

    public static void main(String[] args) {
        Inner inner = new MainApplication().new Inner(10);
    }
}
