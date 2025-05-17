package com.example.aop_logging.service;

import org.springframework.stereotype.Service;

@Service
public class LoggingService {

    public String serve() {
        try {
            Thread.sleep(500); // 일부러 지연
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "서비스 응답";
    }
}
