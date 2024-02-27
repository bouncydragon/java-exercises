package JavaExercism;

public class ElonsToyCar {
    private int drivenMeters;
    private int battery = 100;

    public static void main(String[] args) {
        ElonsToyCar newCar = new ElonsToyCar();
        for (int i = 0; i < 17; i++) {
            newCar.drive();
        }
        newCar.distanceDisplay();
        newCar.batteryDisplay();
    }

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", drivenMeters);
    }

    public String batteryDisplay() {
        if (battery == 0) {
            return "Battery empty";
        }
        return String.format("Battery at %d%%", battery);
    }

    public void drive() {
        if (battery != 0) {
            drivenMeters = drivenMeters + 20;
            battery -= 1;
        }
    }
}
