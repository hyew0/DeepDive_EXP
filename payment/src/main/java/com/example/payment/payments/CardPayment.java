package com.example.payment.payments;

import org.springframework.stereotype.Component;

@Component("cardPayment")
public class CardPayment implements Payment{
    @Override
    public String pay(int amount) {
        return "카드 결제 - "+amount+ "원 결제 완료.";
    }
}
