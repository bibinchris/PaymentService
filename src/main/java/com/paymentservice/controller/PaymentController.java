package com.paymentservice.controller;

import com.paymentservice.dtos.*;
import com.paymentservice.services.*;
import com.razorpay.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/{order_id}")
    public String initiatePayment(@RequestBody InitiatePaymentRequestDto requestDto) throws RazorpayException {
        return paymentService.initiatePayment(requestDto);
    }

    @GetMapping("/test/{id}")
    public ResponseEntity<String> testUserService(@PathVariable("id") Long paymentId) {
        System.out.println("Request Received for PaymentId = " + paymentId);
        return new ResponseEntity<>("PaymentId == "+paymentId, HttpStatus.OK);
    }
}
