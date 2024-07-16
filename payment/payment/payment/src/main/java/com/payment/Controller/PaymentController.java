package com.payment.Controller;

import com.payment.Model.Payment;
import com.payment.Service.PaymentService;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public Payment createPayment(@RequestBody Payment payment) {
        return paymentService.createPayment(payment);
    }

    @PostMapping("/{id}/process")
    public Payment processPayment(@PathVariable Integer id) {
        return paymentService.processPayment(id);
    }

    @GetMapping("/{id}")
    public Payment getPayment(@PathVariable Integer id) {
        return paymentService.getPayment(id);
    }

    @PostMapping("/{id}/refund")
    public Payment refundPayment(@PathVariable Integer id) {
        return paymentService.refundPayment(id);
    }
}
