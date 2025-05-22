package com.example.di.printer;

public class ConsolePrinter implements Printer {

    @Override
    public void print(String message) {
        System.out.println("ConsolePrinter 출력: " + message);
    }
}
