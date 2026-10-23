import java.util.Scanner;

public class Problem1025 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        short[] groups = new short[reader.nextByte()];
        for (byte n = 0; n < groups.length; n++) {
            short group = reader.nextShort();
            byte i = n;
            while (i > 0) {
                if (groups[i - 1] <= group) {
                    break;
                }
                groups[i] = groups[i - 1];
                i--;
            }
            groups[i] = group;
        }
        short voters = 0;
        for (byte i = 0; i <= groups.length / 2; i++) {
            voters += groups[i] / 2 + 1;
        }
        System.out.print(voters);
    }
}