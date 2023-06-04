public class HotChocolate extends Coffee {
    public HotChocolate() {
        super("Hot Chocolate", 1.50);
    }

    @Override
    public double calculateCost() {
        return price;
    }
}