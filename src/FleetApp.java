import java.util.ArrayList;
import java.util.Scanner;

public class FleetApp {

    private ArrayList<Vehicle> vehicles = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        while (true) {
            System.out.println("\nFleet Management System");
            System.out.println("1. Print all vehicles");
            System.out.println("2. Add new car");
            System.out.println("3. Add new bus");
            System.out.println("4. Show total yearly insurance fees");
            System.out.println("5. Show vehicles older than N years");
            System.out.println("6. Perform service for all vehicles");
            System.out.println("7. Quit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> printVehicles();
                case 2 -> addCar();
                case 3 -> addBus();
                case 4 -> showTotalInsurance();
                case 5 -> showOlderThan();
                case 6 -> performService();
                case 7 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }

    private void printVehicles() {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles in the fleet");
        } else {
            for (Vehicle v : vehicles) {
                System.out.println(v);
            }
        }
    }

    private void addCar() {
        System.out.print("Model: ");
        String model = scanner.next();
        System.out.print("Year: ");
        int year = scanner.nextInt();
        System.out.print("Base price: ");
        double price = scanner.nextDouble();
        System.out.print("Number of doors: ");
        int doors = scanner.nextInt();

        vehicles.add(new car(model, year, price, doors));
    }

    private void addBus() {
        System.out.print("Model: ");
        String model = scanner.next();
        System.out.print("Year: ");
        int year = scanner.nextInt();
        System.out.print("Base price: ");
        double price = scanner.nextDouble();
        System.out.print("Passenger capacity: ");
        int capacity = scanner.nextInt();

        vehicles.add(new bus(model, year, price, capacity));
    }

    private void showTotalInsurance() {
        double sum = 0;
        for (Vehicle v : vehicles) {
            sum += v.calculateInsuranceFee();
        }
        System.out.println("Total insurance fee: " + sum);
    }

    private void showOlderThan() {
        System.out.print("Current year: ");
        int currentYear = scanner.nextInt();
        System.out.print("N years: ");
        int n = scanner.nextInt();

        for (Vehicle v : vehicles) {
            if (v.getAge(currentYear) > n) {
                System.out.println(v);
            }
        }
    }

    private void performService() {
        for (Vehicle v : vehicles) {
            if (v instanceof Servicable s) {
                s.performService();
            }
        }
    }
}

