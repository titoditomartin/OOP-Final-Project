public class BlackCoffee extends Coffee {
    public BlackCoffee() {
        super("Black Coffee", 2.00);
    }

    @Override
    public double calculateCost() {
        return price;
    }
}