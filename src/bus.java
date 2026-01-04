public class bus extends Vehicle implements Servicable {

    private int passengerCapacity;

    public bus(String model, int year, double basePrice, int passengerCapacity) {
        super(model, year, basePrice);
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void performService(){

    }

    public int getServiceIntervalKm(){
        return 1;
    }


    @Override
    public double calculateInsuranceFee() {
        return basePrice * 0.1 + passengerCapacity * 50;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", basePrice=" + basePrice +
                ", capacity=" + passengerCapacity +
                '}';
    }
}

