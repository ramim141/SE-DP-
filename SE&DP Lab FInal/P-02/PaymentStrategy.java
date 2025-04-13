interface PaymentStrategy {

    double pay(double amount);
    String getDescription();
}