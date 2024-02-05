package com.paymentservice.controller;

import com.paymentservice.dtos.*;
import com.paymentservice.services.*;
import com.razorpay.*;
import org.springframework.web.bind.annotation.*;

@RestController("/payment")
public class PaymentController {

    PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/{order_id}")
    public String initiatePayment(@RequestBody InitiatePaymentRequestDto requestDto) throws RazorpayException {
        return paymentService.initiatePayment(requestDto);
    }
}
