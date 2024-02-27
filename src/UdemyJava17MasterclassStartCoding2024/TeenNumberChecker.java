package UdemyJava17MasterclassStartCoding2024;

public class TeenNumberChecker {
    static int minTeenAge = 13;
    static int maxTeenAge = 19;
    public static boolean hasTeen(int teen1, int teen2, int teen3) {
        return teen1 >= minTeenAge && teen1 <= maxTeenAge || teen2 >= minTeenAge && teen2 <= maxTeenAge || teen3 >= minTeenAge && teen3 <= maxTeenAge;
    }

    public static boolean isTeen(int teenAge) {
        return teenAge >= minTeenAge && teenAge <= maxTeenAge;
    }


}
