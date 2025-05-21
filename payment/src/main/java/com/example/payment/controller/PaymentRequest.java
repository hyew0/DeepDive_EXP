package com.example.payment.controller;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PaymentRequest {
    private String method;
    private int amount;
}
