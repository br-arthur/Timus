import java.util.Scanner;

public class Problem2066 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        byte a = reader.nextByte();
        byte b = reader.nextByte();
        byte c = reader.nextByte();
        System.out.print(Math.min(a - b * c, a - b - c));
    }
}