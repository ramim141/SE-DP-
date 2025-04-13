class BkashPayment implements PaymentStrategy{
    
    
    @Override
    public double pay(double amount) {
       
       // System.out.println("Payment is done using Bkash for BDT "+amount);
        return amount; 
    }
    

    @Override
    public String getDescription(){
        return "Bkash Payment";
    }
    
}
