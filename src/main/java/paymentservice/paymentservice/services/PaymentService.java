package paymentservice.paymentservice.services;

import org.springframework.stereotype.Service;
import paymentservice.paymentservice.services.paymentGateway.PaymentGateway;

@Service
public class PaymentService {

    private PaymentGatewayChooseStrategy paymentGatewayChooseStrategy;

    public PaymentService(PaymentGatewayChooseStrategy paymentGatewayChooseStrategy) {
        this.paymentGatewayChooseStrategy = paymentGatewayChooseStrategy;
    }

    public String initiatePayment(String orderId, String email, String phoneNumber, Long amount){
        //Order order= orderService.getOrderDetails(ordeId);
        //Long amount = order.getAmount();

//        Long amount = 1010L; // divide by 100;

        PaymentGateway paymentGateway = paymentGatewayChooseStrategy.getBestPaymentGateway();

        return paymentGateway.generatePaymentLink(orderId,email,phoneNumber,amount);
    }
}
