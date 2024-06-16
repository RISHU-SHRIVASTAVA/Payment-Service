package paymentservice.paymentservice.controller;

import org.springframework.web.bind.annotation.*;
import paymentservice.paymentservice.dtos.InitiatePaymentRequestDto;
import paymentservice.paymentservice.services.PaymentService;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/")
    public String intiatePayment(@RequestBody InitiatePaymentRequestDto requestDto){

        String phoneNumber = requestDto.getPhoneNumber();
        return paymentService.initiatePayment(requestDto.getOrderId(),
                requestDto.getEmail(),
                requestDto.getPhoneNumber(),
                requestDto.getAmount());
    }
}
