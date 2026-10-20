import java.util.Scanner;

public class Problem1068 {
    public static void main(String[] args) {
        short N = new Scanner(System.in).nextShort();
        System.out.print(N < 1 ? (1 + N) * (2 - N) / 2 : (1 + N) * N / 2);
    }
}