package UdemyJava17MasterclassStartCoding2024;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
        boolean isNotInRange = hourOfDay < 0 || hourOfDay > 23;
        boolean isInRange = (hourOfDay < 8 || hourOfDay > 22) && !isNotInRange;
        return isBarking && isInRange;
    }
}
