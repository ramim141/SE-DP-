public class CardPayment implements PaymentStrategy {
    

    @Override
    public double pay(double amount) {
       
       // System.out.println("Payment is done using Card for BDT "+amount);
       return amount;
    }

    @Override
    public String getDescription(){
        return "Card Payment";
    }
}
