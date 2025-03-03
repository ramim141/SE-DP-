class ContextPayment {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void executePayment(int money) {
        if (paymentStrategy == null) {
            System.out.println("No payment method selected");
        } else {
            paymentStrategy.pay(money);
        }
    }
}