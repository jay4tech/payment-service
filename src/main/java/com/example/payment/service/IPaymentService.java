package com.example.payment.service;

import com.example.payment.entity.Payment;

public interface IPaymentService {
    Payment receivePayment(Payment payment);
}
