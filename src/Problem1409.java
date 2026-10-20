import java.util.Scanner;

public class Problem1409 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        byte harry = reader.nextByte();
        System.out.print((reader.nextByte() - 1) + " " + (harry - 1));
    }
}