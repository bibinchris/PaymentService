package com.paymentservice.paymentGateway;

import com.razorpay.*;

public interface PaymantGateway {

    public String generatePaymentLink(String orderId, Long amount, String email, String phNo) throws RazorpayException;
}
