public class Main {
    public static void main(String[] args) {

        Servicable s1 = new car("Toyota", 2020, 10000, 4);
        Servicable s2 = new bus("Mercedes", 2018, 20000, 40);

        s1.performService();   // Car service completed
        s2.performService();   // Bus service completed

        System.out.println("Car service interval: " + s1.getServiceIntervalKm());
        System.out.println("Bus service interval: " + s2.getServiceIntervalKm());
    }
}
