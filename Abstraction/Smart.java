// Interface
interface VoiceControlled {
    void voiceCommand(String command);
}

// Base class
class Appliance {
    String brand;

    Appliance(String brand) {
        this.brand = brand;
    }

    void turnOn() {
        System.out.println(brand + " appliance is ON");
    }

    void turnOff() {
        System.out.println(brand + " appliance is OFF");
    }
}

// SmartLight class
class SmartLight extends Appliance implements VoiceControlled {

    SmartLight(String brand) {
        super(brand);
    }

    @Override
    public void voiceCommand(String command) {
        System.out.println("SmartLight executing command: " + command);
    }
}

// SmartThermostat class
class SmartThermostat extends Appliance implements VoiceControlled {

    SmartThermostat(String brand) {
        super(brand);
    }

    @Override
    public void voiceCommand(String command) {
        System.out.println("SmartThermostat executing command: " + command);
    }
}

// Main class
public class Smart {
    public static void main(String[] args) {

        SmartLight light = new SmartLight("Philips");
        light.turnOn();
        light.voiceCommand("Turn on light");

        System.out.println();

        SmartThermostat thermo = new SmartThermostat("LG");
        thermo.turnOn();
        thermo.voiceCommand("Set temperature to 24 degrees");
    }
}