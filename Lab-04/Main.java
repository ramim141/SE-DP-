public class Main{
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setProcessor("Intel i7")
                .setStorage("1TB")
                .setGraphicsCard("Nvidia RTX 3090");
        Computer computer = customer.build();
        computer.Display();
    }
    
}