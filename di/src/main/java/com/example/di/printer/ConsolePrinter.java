package com.example.di.printer;

import org.springframework.stereotype.Component;

@Component
public class ConsolePrinter implements Printer {

    @Override
    public void print(String message) {
        System.out.println("ConsolePrinter 출력: " + message);
    }
}
