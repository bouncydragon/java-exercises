package UdemyJava17MasterclassStartCoding2024;

public class SpeedConverter {
    // NOTE: 1 mile per hour is 1.609 kilometers per hour
    static double kmPerHr = 1.609;
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour > 0) {
            return Math.round(kilometersPerHour / kmPerHr);
        }
        if (kilometersPerHour == 0) {
            return 0;
        }
        return -1;
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long computed = toMilesPerHour(kilometersPerHour);
            String result = kilometersPerHour +" km/h = " + computed + " mi/h";
            System.out.println(String.format(result));
        }
    }
}
