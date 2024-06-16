package paymentservice.paymentservice.services;

import org.springframework.stereotype.Service;
import paymentservice.paymentservice.services.paymentGateway.PaymentGateway;
import paymentservice.paymentservice.services.paymentGateway.RazorpayPaymentGateway;
import paymentservice.paymentservice.services.paymentGateway.StripePaymentGateway;

import java.util.Random;
@Service
public class PaymentGatewayChooseStrategy {
    private RazorpayPaymentGateway razorpayPaymentGateway;
    private StripePaymentGateway stripePaymentGateway;

    public PaymentGatewayChooseStrategy(RazorpayPaymentGateway razorpayPaymentGateway, StripePaymentGateway stripePaymentGateway) {
        this.razorpayPaymentGateway = razorpayPaymentGateway;
        this.stripePaymentGateway = stripePaymentGateway;
    }

    public PaymentGateway getBestPaymentGateway(){
//        int randomInt = new Random().nextInt();
//        if(randomInt%2==0){
//            return razorpayPaymentGateway;
//        }
//        else{
//            return stripePaymentGateway;
//        }
        return stripePaymentGateway;
    }
}
