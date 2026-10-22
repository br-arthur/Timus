import java.util.HashSet;
import java.util.Scanner;

public class Problem1563 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        HashSet<String> brands = new HashSet<String>();
        short count = 0;
        for (short N = reader.nextShort(); N >= 0; N--) {
            String brand = reader.nextLine();
            if (brands.contains(brand)) {
                count++;
            } else {
                brands.add(brand);
            }
        }
        System.out.print(count);
    }
}