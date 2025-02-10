public class Computer {
    public String processor;
    public String storage;
    public String graphicsCard;


    public Computer(Customer customer) {
        this.processor = customer.processor;
        this.storage = customer.storage;
        this.graphicsCard = customer.graphicsCard;
    }
    public String set_processor(String processor) {
        this.processor = processor;
        return processor;
    }
    public String set_storage(String storage) {
        this.storage = storage;
        return storage;
    }


    void Display() {
        System.out.println("Processor: " + processor);
        System.out.println("Storage: " + storage);
        System.out.println("Graphics Card: " + graphicsCard);
    }
   

    
}
