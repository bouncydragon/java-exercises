public class SqueakyClean {
    public static void main(String[] args) {
        clean("¡hello world!.");
    }

    public static String clean(String identifier) {
        String temp = "";

        for (int i = 0; i < identifier.length(); i++) {
            if (Character.isWhitespace(identifier.charAt(i))) {
                temp += "_";
            } else if (i > 0 && identifier.charAt(i - 1) == '-') {
                temp += Character.toUpperCase(identifier.charAt(i));
            } else if (Character.isDigit(identifier.charAt(i))) {
                temp += conversion(identifier.charAt(i));
            } else if (!Character.isLetterOrDigit(identifier.charAt(i))) {
                // Do nothing
            } else {
                temp += identifier.charAt(i);
            }
        }
        return temp.replace("-", "");
    }
    public static char conversion(char digit) {
        return switch (digit) {
            case '0' -> 'o';
            case '1' -> 'l';
            case '3' -> 'e';
            case '4' -> 'a';
            case '7' -> 't';
            default -> ' ';
        };
    }
}