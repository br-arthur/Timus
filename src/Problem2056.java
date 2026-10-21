import java.util.Scanner;

public class Problem2056 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        boolean satisfactory = false;
        byte sum = 0;
        byte n = reader.nextByte();
        for (byte i = 0; i < n; i++) {
            byte m = reader.nextByte();
            if (m == 3) {
                satisfactory = true;
            }
            sum += m;
        }
        double average = (double) sum / n;
        System.out.print(satisfactory ? "None" : (average == 5 ? "Named" : (average >= 4.5 ? "High" : "Common")));
    }
}