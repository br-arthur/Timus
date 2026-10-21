import java.util.Scanner;

public class Problem1638 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        byte sheets = reader.nextByte();
        byte cover = reader.nextByte();
        byte start = reader.nextByte();
        byte end = reader.nextByte();
        System.out.print(start < end ? (end - start - 1) * sheets + 2 * (end - start) * cover : (start - end + 1) * sheets + 2 * (start - end) * cover);
    }
}