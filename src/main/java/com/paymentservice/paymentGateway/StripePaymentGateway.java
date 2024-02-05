package com.paymentservice.paymentGateway;

import org.springframework.stereotype.*;

@Component
public class StripePaymentGateway implements PaymantGateway{
    @Override
    public String generatePaymentLink(String orderId, Long amount, String email, String phNo) {
        return null;
    }
}
