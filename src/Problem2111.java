import java.util.Scanner;

public class Problem2111 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        long total = 0;
        for (int i = reader.nextInt(); i > 0; i--) {
            total += reader.nextShort();
        }
        System.out.print(total * total);
    }
}