public class car extends Vehicle implements Servicable {

    private int numberOfDoors;

    public car(String model, int year, double basePrice, int numberOfDoors) {
        super(model, year, basePrice);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public double calculateInsuranceFee() {
        return basePrice * 0.05 + numberOfDoors * 100;
    }

    @Override
    public void performService() {
        System.out.println("Car service completed");
    }

    @Override
    public int getServiceIntervalKm() {
        return 10000;
    }
}