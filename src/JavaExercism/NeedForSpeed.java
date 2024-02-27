package JavaExercism;

public class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int distanceDriven;
    private int remainingBattery = 100;
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public static void main(String[] args) {
        NeedForSpeed formulaOne = new NeedForSpeed(5, 2);
        RaceTrack nfs = new RaceTrack(100);

        formulaOne.distanceDriven();
        nfs.tryFinishTrack(formulaOne);
        formulaOne.distanceDriven();
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }

    public boolean batteryDrained() {
        return this.remainingBattery < this.batteryDrain;
    }

    public int distanceDriven() {
        System.out.println(distanceDriven);
        return this.distanceDriven;
    }

    public void drive() {
        if (!batteryDrained()) {
            this.distanceDriven += this.speed;
            this.remainingBattery -= this.batteryDrain;
        }
    }
}

class RaceTrack {
    private int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        while(!car.batteryDrained()){
            car.drive();
        }
        int distanceDriven = car.distanceDriven();
        return distanceDriven >= distance;
    }
}