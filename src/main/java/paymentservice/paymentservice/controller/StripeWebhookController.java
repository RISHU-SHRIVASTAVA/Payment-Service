package paymentservice.paymentservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import com.stripe.model.*;



@RestController
@RequestMapping("/stripeWebhook")
public class StripeWebhookController {
    @PostMapping
    public void receiveWebhookEvent(Event event) {
        System.out.println("Waiting");
        // 0. Match the secret

        // 1. Read the event details

//        if (event.type == "payment_link.created") {
//            // ...
//        } elif (event.type == "payment_link.updated") {
//            // ..
//        } elif (event.type == ""payment.received) {
//
//        }

    }
}