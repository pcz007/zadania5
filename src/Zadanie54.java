import java.util.Scanner;

public class Zadanie54 {

    public static void main(String[] args) {

        int x;
        int y;

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj punkt na osi X: ");
        x = scan.nextInt();
        System.out.println("Podaj punkt na osi Y: ");
        y = scan.nextInt();

        if (x > 0 && y > 0) {
            System.out.printf("Punkt (%d, %d) leży w I ćwiartce układu współrzędnych", x, y);
        }
        if (x < 0 && y > 0) {
            System.out.printf("Punkt (%d, %d) leży w II ćwiartce układu współrzędnych", x, y);
        }
        if (x < 0 && y < 0) {
            System.out.printf("Punkt (%d, %d) leży w III ćwiartce układu współrzędnych", x, y);
        }
        if (x > 0 && y < 0) {
            System.out.printf("Punkt (%d, %d) leży w VI ćwiartce układu współrzędnych", x, y);

            scan.close();
        }
    }
}
