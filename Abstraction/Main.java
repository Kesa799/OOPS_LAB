// Abstract class
abstract class Vehicle {

    // Abstract methods
    abstract void start();
    abstract void fuelType();
}

// Subclass Car
class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts with a key or button");
    }

    @Override
    void fuelType() {
        System.out.println("Fuel Type: Petrol/Diesel");
    }
}

// Subclass ElectricBike
class ElectricBike extends Vehicle {

    @Override
    void start() {
        System.out.println("Electric Bike starts with a switch");
    }

    @Override
    void fuelType() {
        System.out.println("Fuel Type: Electricity");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Vehicle v1 = new Car();
        v1.start();
        v1.fuelType();

        System.out.println();

        Vehicle v2 = new ElectricBike();
        v2.start();
        v2.fuelType();
    }
}