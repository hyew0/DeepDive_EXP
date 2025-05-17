package com.example.aop_logging.controller;

import com.example.aop_logging.service.LoggingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {
    private final LoggingService loggingService;

    public LoggingController(LoggingService loggingService) {
        this.loggingService = loggingService;
    }

    @GetMapping("/test")
    public String testService() {
        return loggingService.serve();
    }
}
