package UdemyJava17MasterclassStartCoding2024;

public class LeapYearCalculator {
    public static void main(String[] args) {
        LeapYearCalculator.isLeapYear(2400);
    }
    public static boolean isLeapYear(int year) {
        int isDivisibleByFour = year % 4;
        int isDivisibleByHundred = year % 100;
        int isDivisibleByFourHundred = year % 400;
        boolean isInRange = year < 1 || year > 9999;

        return ((isDivisibleByFour == 0 && isDivisibleByHundred != 0) || (isDivisibleByHundred == 0 && isDivisibleByFourHundred == 0)) && !isInRange;
    }
}
