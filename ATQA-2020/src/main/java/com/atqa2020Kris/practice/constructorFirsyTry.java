package com.atqa2020Kris.practice;

public class constructorFirsyTry {

    private String date = "today";

    constructorFirsyTry(String Date) {

        this.date = date;
    }

    public constructorFirsyTry() {

    }


    public void printHello() {

        System.out.printf("Hello from the constructor - %s", date);
    }
}