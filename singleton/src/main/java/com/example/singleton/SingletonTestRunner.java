package com.example.singleton;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SingletonTestRunner implements CommandLineRunner {

    private final ApplicationContext context;

    public SingletonTestRunner(ApplicationContext context) {
        this.context = context;
    }

    @Override
    public void run(String... args) throws Exception {
        SingletonComponent single1 = context.getBean(SingletonComponent.class);
        SingletonComponent single2 = context.getBean(SingletonComponent.class);

        System.out.println("single1 = " + single1);
        System.out.println("single2 = " + single2);
        System.out.println("같은 객체? " + (single1 == single2));
    }
}
