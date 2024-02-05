package com.paymentservice.services;

import com.paymentservice.dtos.*;
import com.paymentservice.paymentGateway.*;
import com.razorpay.*;
import org.springframework.stereotype.*;

@Service
public class PaymentService {

    public final PaymantGateway paymantGateway;

    public PaymentService(RazorpayPaymentGateway paymantGateway) {
        this.paymantGateway = paymantGateway;
    }

    public String initiatePayment(InitiatePaymentRequestDto requestDto) throws RazorpayException {
        return paymantGateway.generatePaymentLink(requestDto.getOrderId(), requestDto.getAmount(), requestDto.getEmail(), requestDto.getPhNo());
    }
}
