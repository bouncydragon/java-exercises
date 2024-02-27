package JavaExercism;

public class CookYourLasagna {
    public static void main(String[] args) {
    }
    public static int expectedMinutesInOven() {
        return 40;
    }

    public static int remainingMinutesInOven(int actualMins) {
        return expectedMinutesInOven() - actualMins;
    }

    public static int preparationTimeInMinutes(int layers) {
        return 2 * layers;
    }

    public static int totalTimeInMinutes(int layers, int minutes) {
        return preparationTimeInMinutes(layers) + minutes;
    }
}
