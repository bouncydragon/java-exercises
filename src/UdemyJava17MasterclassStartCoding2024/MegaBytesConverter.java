package UdemyJava17MasterclassStartCoding2024;

public class MegaBytesConverter {
    static int baseKiloByte = 1024;

    public static void main(String[] args) {}

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes >= 0) {
            int mbResult = kiloBytes / baseKiloByte;
            int kbResult = kiloBytes % baseKiloByte;

            System.out.println(String.format("%d KB = %d MB and %d KB", kiloBytes, mbResult, kbResult));
        } else {
            System.out.println("Invalid Value");
        }
    }
}
