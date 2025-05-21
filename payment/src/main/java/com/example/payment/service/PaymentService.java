package com.example.payment.service;

import com.example.payment.payments.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PaymentService {
    private final Map<String, Payment> paymentMap;

    @Autowired
    public PaymentService(Map<String, Payment> paymentMap) {
        this.paymentMap = paymentMap;
    }

    public String processPayment(String method, int amount) {
        Payment payment = paymentMap.get(method);
        if (payment == null) {
            return "지원하지 않는 결제 방식: " + method;
        }
        return payment.pay(amount);
    }

}
