import java.util.Scanner;

public class Problem1877 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        short first = reader.nextShort(), second = reader.nextShort();
        System.out.print((first % 2 == 0) || (second % 2 == 1) ? "yes" : "no");
    }
}