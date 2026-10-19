import java.util.Scanner;

public class Problem1001 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String output = "";
        while (reader.hasNextLong()) {
            output = String.format("%.4f %n", Math.sqrt(reader.nextLong())) + output;
        }
        System.out.print(output);
    }
}