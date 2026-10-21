import java.util.Scanner;

public class Problem1197 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String output = "";
        for (byte N = reader.nextByte(); N > 0; N--) {
            String square = reader.next();
            char file = square.charAt(0);
            char rank = square.charAt(1);
            switch (file) {
                case 'a':
                case 'h':
                    switch (rank) {
                        case '1':
                        case '8':
                            output += 2 + "\n";
                            break;
                        case '2':
                        case '7':
                            output += 3 + "\n";
                            break;
                        default:
                            output += 4 + "\n";
                            break;
                    }
                    break;
                case 'b':
                case 'g':
                    switch (rank) {
                        case '1':
                        case '8':
                            output += 3 + "\n";
                            break;
                        case '2':
                        case '7':
                            output += 4 + "\n";
                            break;
                        default:
                            output += 6 + "\n";
                            break;
                    }
                    break;
                default:
                    switch (rank) {
                        case '1':
                        case '8':
                            output += 4 + "\n";
                            break;
                        case '2':
                        case '7':
                            output += 6 + "\n";
                            break;
                        default:
                            output += 8 + "\n";
                            break;
                    }
                    break;
            }
        }
        System.out.print(output);
    }
}