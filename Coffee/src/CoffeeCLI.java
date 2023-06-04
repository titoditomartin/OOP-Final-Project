import java.util.Scanner;

public class CoffeeCLI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to ZeCoffee CLI!");

        boolean exit = false;
        while (!exit) {
            System.out.println("Please select your options:");
            System.out.println("1. Order Coffee");
            System.out.println("2. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    handleOrderCoffee(scanner);
                    break;
                case 2:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        System.out.println("Thank you for using ZeCoffee CLI. Goodbye!");
    }

    private static void handleOrderCoffee(Scanner scanner) {
        System.out.println("Select your coffee:");
        System.out.println("1. Black Coffee");
        System.out.println("2. Caramel Macchiato");
        System.out.println("3. Hot Chocolate");

        int coffeeChoice = scanner.nextInt();
        Coffee coffee;

        switch (coffeeChoice) {
            case 1:
                coffee = new BlackCoffee();
                break;
            case 2:
                coffee = new CaramelMacchiato();
                break;
            case 3:
                coffee = new HotChocolate();
                break;
            default:
                System.out.println("Invalid choice. Order canceled.");
                return;
        }

        // Rest of the code...

        double subtotal = coffee.calculateCost();

        System.out.println("Select additional items (y/n):");
        String additionalItemsChoice = scanner.next();

        if (additionalItemsChoice.equalsIgnoreCase("y")) {
            System.out.println("Select your additional items:");
            System.out.println("1. Donuts");
            System.out.println("2. Bagels");
            System.out.println("3. Cakes");

            System.out.println("Enter the number of each item:");

            System.out.print("Donuts: ");
            int donutsCount = scanner.nextInt();
            subtotal += donutsCount * 1.25;

            System.out.print("Bagels: ");
            int bagelsCount = scanner.nextInt();
            subtotal += bagelsCount * 1.15;

            System.out.print("Cakes: ");
            int cakesCount = scanner.nextInt();
            subtotal += cakesCount * 1.00;
        }

        double taxRate = 0.08;
        double tax = subtotal * taxRate;
        double total = subtotal + tax;

        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
    }
}
