import java.util.Scanner;

public class Problem1149 {
    public static String A(int i, int n) {
        return "sin(" + i + (i == n ? "" : (i % 2 == 0 ? "+" : "-") + A(i+1, n)) + ")";
    }

    public static String S(int j, int n) {
        return (j == n ? "" : "(" + S(j+1, n) + ")") + A(1, n+1-j) + "+" + j;
    }

    public static void main(String[] args) {
        System.out.print(S(1, new Scanner(System.in).nextInt()));
    }
}