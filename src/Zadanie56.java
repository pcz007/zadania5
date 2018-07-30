import java.util.Scanner;

public class Zadanie56 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int liczba;
        int limit1 = 100;
        int limit2 = 200;

        System.out.println("Podaj liczbę");
        while ((liczba = scan.nextInt()) < 100 || liczba > 200 || liczba % 3 != 0) {
            if (liczba < 100) {
                System.out.println("Podana liczba jest za mała, zgaduj dalej!");
            } else if (liczba > 200) {
                System.out.println("Podana liczba jest za duża, zgaduj dalej!");
            } else if (liczba % 3 != 0) {
                System.out.println("Twoja liczba nie jest podzielna przez 3");
            }
        }
        System.out.println("Twoja liczba jest spoko!");
    }
}









