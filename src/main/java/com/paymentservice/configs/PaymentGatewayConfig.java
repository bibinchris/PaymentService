package com.paymentservice.configs;


import com.razorpay.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;

@Configuration
public class PaymentGatewayConfig {
    @Value("${razorpay.key.id}")
    private String razorPayId;

    @Value("${razorpay.key.secret}")
    private String razorPaySecret;

    @Bean
    public RazorpayClient createRazorpayClient() throws RazorpayException {
        RazorpayClient razorpay = new RazorpayClient(razorPayId, razorPaySecret);
        return razorpay;
    }
}
