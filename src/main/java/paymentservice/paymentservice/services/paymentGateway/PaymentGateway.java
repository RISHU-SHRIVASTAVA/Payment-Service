package paymentservice.paymentservice.services.paymentGateway;

import com.stripe.exception.StripeException;

public interface PaymentGateway {
    String generatePaymentLink(String orderId, String email, String phoneNumber, Long amount) throws StripeException;

}
