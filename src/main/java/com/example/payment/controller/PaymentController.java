package com.example.payment.controller;

import com.example.payment.entity.Payment;
import com.example.payment.service.IPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "payments")
public class PaymentController {

    @Autowired
    IPaymentService paymentService;
    @PostMapping("/")
    public Payment receivePayment(@RequestBody Payment payment){
        return paymentService.receivePayment(payment);
    }
}