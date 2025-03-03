class Main{
    public static void main(String[] args) {
        ContextPayment context = new ContextPayment();

        // Selecting Credit Card Payment
        context.setPaymentStrategy(new CreditCardPayment());
        context.executePayment(500);

        // Selecting Bkash Payment
        context.setPaymentStrategy(new BkashPayment());
        context.executePayment(700);

        // Selecting Cash on Delivery
        context.setPaymentStrategy(new CashOnDelivery());
        context.executePayment(1000);
    }
}