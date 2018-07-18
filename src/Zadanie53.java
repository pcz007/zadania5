public class Zadanie53 {

    public static void main(String[] args) {

        double liczba = 0;

        System.out.println("Pętla while: ");
        while (liczba < 3) {
            System.out.printf("%.1f , ", liczba);
            liczba = liczba + 0.1;
        }
        System.out.printf("%.1f", liczba);

        liczba = 0;

        System.out.println("\nPętla do while");
        do {
            System.out.printf("%.1f , ", liczba);
            liczba = liczba + 0.1;
        } while (liczba < 3);
        System.out.printf("%.1f", liczba);
    }
}
