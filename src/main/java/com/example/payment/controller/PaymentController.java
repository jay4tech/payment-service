package com.example.payment.controller;

import com.example.payment.model.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "payment")
public class PaymentController {
    @GetMapping("/{orderId}")
    public Payment getPaymentByOrderId(@PathVariable String orderId) {
        return new Payment(orderId, "PAID");
    }
}