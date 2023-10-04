package com.example.payment.service;

import com.example.payment.entity.Payment;
import com.example.payment.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService implements IPaymentService{

    @Autowired
    PaymentRepository paymentRepository;
    @Override
    public Payment receivePayment(Payment payment) {
        /* The logic of payment goes here.
        *********** After successful payment, Payment details will be saved
        */
        return paymentRepository.save(payment);
    }
}
