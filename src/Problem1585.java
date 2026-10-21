import java.util.Scanner;

public class Problem1585 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        short emperor, little, macaroni;
        emperor = little = macaroni = 0;
        for (short n = reader.nextShort(); n >= 0; n--) {
            switch (reader.nextLine()) {
                case "Emperor Penguin":
                    emperor++;
                    break;
                case "Little Penguin":
                    little++;
                    break;
                case "Macaroni Penguin":
                    macaroni++;
                    break;
            }
        }
        System.out.print(emperor > little ? (emperor > macaroni ? "Emperor Penguin" : "Macaroni Penguin") : (little > macaroni ? "Little Penguin" : "Macaroni Penguin"));
    }
}