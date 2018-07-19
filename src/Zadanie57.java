import java.util.Locale;
import java.util.Scanner;

public class Zadanie57 {

    public static void main(String[] args) {

        String[] imiona = new String[5];

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        for (int i = 0; i < imiona.length; i++) {
            System.out.println("Podaj imię osoby: ");
            imiona[i] = scan.nextLine();
        }
        for (int i = imiona.length - 1; i >= 0; i--) {
            System.out.println("Cześć " + imiona[i]);
        }
    }
}
