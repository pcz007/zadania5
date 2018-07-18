public class Zadanie52 {

    public static void main(String[] args) {

        int[] liczby = new int[5];

            for (int i=0;i<5;i++)
                liczby[i] = i+1;

        int sum = liczby[0] + liczby[2] + liczby[4];
        System.out.println(sum);

    }
}
