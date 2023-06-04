public abstract class Coffee {
    protected String name;
    protected double price;

    public Coffee(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract double calculateCost();

    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}
