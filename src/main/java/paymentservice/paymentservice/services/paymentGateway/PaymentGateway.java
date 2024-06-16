package paymentservice.paymentservice.services.paymentGateway;

public interface PaymentGateway {
    String generatePaymentLink(String orderId, String email, String phoneNumber, Long amount);

}
