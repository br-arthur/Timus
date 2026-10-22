import java.util.Scanner;

public class Problem1545 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String[] hieroglyphs = new String[reader.nextShort()];
        for (short i = 0; i < hieroglyphs.length; i++) {
            hieroglyphs[i] = reader.next();
        }
        char letter = reader.next().charAt(0);
        for (short i = 0; i < hieroglyphs.length; i++) {
            if (hieroglyphs[i].charAt(0) == letter) {
                System.out.println(hieroglyphs[i]);
            }
        }
    }
}