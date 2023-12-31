package com.bessonov.lesson2.interfaces;

public class MainApplication {

    static class Human {
        private Transport currentTransport;

        public void stop() {
            if (currentTransport != null) {
                currentTransport.stop();
                currentTransport = null;
            } else {
                System.out.println("А я никуда и не еду");
            }
        }

        public void drive(Transport transport) {
            transport.start();
            this.currentTransport = transport;

        }

    }

    static class Car implements Transport {

        @Override
        public void start() {
            System.out.println("Человек начал ехать на машине");
        }

        @Override
        public void stop() {
            System.out.println("Человек закончил ехать на машине");
        }
    }

    static class Bycicle implements Transport {
        @Override
        public void start() {
            System.out.println("Человек начал ехать");
        }

        @Override
        public void stop() {
            System.out.println("Человек остановил свой велосипед");
        }
    }

    static class Moto implements Transport {
        @Override
        public void start() {
            System.out.println("Человек начал ехать");
        }

        @Override
        public void stop() {
            System.out.println("Человек остановил свой мотоцикл");
        }
    }

    public static void main(String[] args) {
        Transport transport = new Car();
        Human h = new Human();
        h.stop();
        h.drive(transport);
        h.stop();
    }
}
