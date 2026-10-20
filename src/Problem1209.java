import java.util.Scanner;

public class Problem1209 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String output = "";
        for (int N = reader.nextInt(); N > 0; N--) {
            output += (Math.sqrt(8 * reader.nextDouble() - 7) % 1 == 0 ? 1 : 0)  + " ";
        }
        System.out.print(output);
    }
}