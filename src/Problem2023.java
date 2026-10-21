import java.util.Scanner;

public class Problem2023 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        byte current = -1;
        short moves = 0;
        for (short n = reader.nextShort(); n > 0; n--) {
            switch (reader.next().charAt(0)) {
                case 'A':
                case 'O':
                case 'P':
                case 'R':
                    moves += current + 1;
                    current = -1;
                    break;
                case 'B':
                case 'M':
                case 'S':
                    moves += Math.abs(current);
                    current = 0;
                    break;
                case 'D':
                case 'G':
                case 'J':
                case 'K':
                case 'T':
                case 'W':
                    moves += 1 - current;
                    current = 1;
                    break;
            }
        }
        System.out.print(moves);
    }
}