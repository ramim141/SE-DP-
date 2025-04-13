import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        

        while (true) {
            System.out.println("Enter your choice:");
            System.out.println("1. Process payment with Bkash");
            System.out.println("2. Process payment with Credit Card");
            System.out.println("3. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Processing payment with Bkash...");
                    
                    Checkout pp = Checkout.getInstance(new BkashPayment());
                    pp.setPaymentStrategy(new BkashPayment());
                    pp.processPayment(1000.00);
                    break;
                case 2:
                    System.out.println("Processing payment with Credit Card...");
                    Checkout pp2 = Checkout.getInstance(new CardPayment());
                    pp2.setPaymentStrategy(new CardPayment());
                    pp2.processPayment(2000.00);
                    break;
                
                case 3:
                    System.out.println("Processing payment with Nagad Card...");
                    Checkout pp3 = Checkout.getInstance(new NagadPayment());
                    pp3.setPaymentStrategy(new NagadPayment());
                    pp3.processPayment(2000.00);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            sc.close();
        }
       

   
    }
    
}
