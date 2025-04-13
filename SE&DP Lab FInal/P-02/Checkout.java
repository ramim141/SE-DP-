public class Checkout {
    private PaymentStrategy p1;

    private static Checkout payment = null;

    private Checkout(PaymentStrategy p1) {
        this.p1 = p1;
    }

    public static Checkout getInstance(PaymentStrategy p1){
        if(payment == null){
            payment = new Checkout(p1);
        }
        return payment;
    }

    public void setPaymentStrategy(PaymentStrategy p1) {
        this.p1 = p1;

    }

    public void processPayment(double amount){
        if(amount < 0){
            System.out.println("Invalid amount. Amount must be greater than 0.");
        }
        double total = p1.pay(amount);
        System.out.println("Total amount: " + total);
        System.out.println("Fee description: " + p1.getDescription());

    }
}
