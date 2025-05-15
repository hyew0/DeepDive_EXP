package com.example.di;

import com.example.di.service.ServiceA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiApplication implements CommandLineRunner {

	private final ServiceA serviceA;

	@Autowired
    public DiApplication(ServiceA serviceA) {
        this.serviceA = serviceA;
    }

    public static void main(String[] args) {
		SpringApplication.run(DiApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        serviceA.printGetMessage(); // ServiceB의 메시지를 출력
    }

}
