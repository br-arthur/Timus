import java.util.Scanner;

public class Problem2001 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        short a1 = reader.nextShort();
        short b1 = reader.nextShort();
        reader.nextShort();
        short b2 = reader.nextShort();
        short c1 = reader.nextShort();
        reader.nextShort();
        System.out.print((a1 - c1) + " " + (b1 - b2));
    }
}