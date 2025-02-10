
public class Customer {
    public String processor;
    public String storage;
    public String graphicsCard;

    public Customer setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public Customer setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    public Customer setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
        return this;
    }

    public Computer build() {
        return new Computer(this);
    }
}
