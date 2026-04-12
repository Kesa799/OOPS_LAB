// Abstract class
abstract class Appliance {

    // Abstract method
    abstract void turnOn();
}

// WashingMachine class
class WashingMachine extends Appliance {

    @Override
    void turnOn() {
        System.out.println("Washing Machine is now ON and washing clothes");
    }
}

// Refrigerator class
class Refrigerator extends Appliance {

    @Override
    void turnOn() {
        System.out.println("Refrigerator is now ON and cooling items");
    }
}

// Main class
public class On {
    public static void main(String[] args) {

        Appliance a1 = new WashingMachine();
        a1.turnOn();

        Appliance a2 = new Refrigerator();
        a2.turnOn();
    }
}