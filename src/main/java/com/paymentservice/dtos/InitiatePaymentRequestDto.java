package com.paymentservice.dtos;

import lombok.*;

@Getter
@Setter
public class InitiatePaymentRequestDto {
    String orderId;
    String email;
    String phNo;
    Long amount;
}
