import java.util.Scanner;

public class Problem1313 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        byte N = reader.nextByte();
        byte[][] pixels = new byte[N][N];
        for (byte i = 0; i < N; i++) {
            for (byte j = 0; j < N; j++) {
                pixels[i][j] = reader.nextByte();
            }
        }
        String output = "";
        for (byte i = 0; i < N; i++) {
            for (byte j = 0; j <= i; j++) {
                output += pixels[i-j][j] + " ";
            }
        }
        for (byte j = 1; j < N; j++) {
            for (byte i = (byte)(N - 1); i >= j; i--) {
                output += pixels[i][N - 1 - i + j] + " ";
            }
        }
        System.out.print(output);
    }
}