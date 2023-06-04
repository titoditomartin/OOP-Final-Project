public class CaramelMacchiato extends Coffee {
    public CaramelMacchiato() {
        super("Caramel Macchiato", 3.00);
    }

    @Override
    public double calculateCost() {
        return price;
    }
}