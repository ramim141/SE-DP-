class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(int money) {
        System.out.println("Paid " + money + " using Credit Card");
    }
}

