public class NagadPayment implements PaymentStrategy {
    
    @Override
    public double pay(double amount) {
       
       // System.out.println("Payment is done using Nagad for BDT "+amount);
       return amount;
    }

    @Override
    public String getDescription(){
        return "Nagad Payment";
    }

}