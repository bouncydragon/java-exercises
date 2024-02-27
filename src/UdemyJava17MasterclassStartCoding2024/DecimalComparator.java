package UdemyJava17MasterclassStartCoding2024;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        double val1 = num1 * 1000;
        double val2 = num2 * 1000;

        return (long)val1 == (long)val2;
    }
}
