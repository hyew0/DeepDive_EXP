package com.example.di.service;

import com.example.di.printer.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService{

    private final Printer printer;

    @Autowired
    public HelloServiceImpl(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void hello() {
        printer.print("hello, this is di example!!");
    }
}
