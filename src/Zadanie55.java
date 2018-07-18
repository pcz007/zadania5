public class Zadanie55 {

    public static void main(String[] args) {

    int suma = 0;

        for(int liczba = 0; liczba<=100 ; liczba++){
            if (liczba%2==0){
                System.out.println(liczba);
                suma = suma + liczba;
            }
        }   System.out.println("Suma wszystkich liczb to " + suma);
    }
}

