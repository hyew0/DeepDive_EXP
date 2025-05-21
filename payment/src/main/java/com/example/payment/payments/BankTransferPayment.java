package com.example.payment.payments;

import org.springframework.stereotype.Component;

@Component("bankTransfer")
public class BankTransferPayment implements Payment{
    @Override
    public String pay(int amount) {
        return "계좌이체 결제 - "+amount+ "원 결제 완료.";
    }
}
