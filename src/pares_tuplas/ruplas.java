import java.util.Scanner;

public class ruplas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de conjuntos: ");
        int r = sc.nextInt();

        int total = 1;

        for (int i = 1; i <= r; i++) {

            System.out.print("Elementos do conjunto " + i + ": ");
            int n = sc.nextInt();

            total *= n;
        }

        System.out.println("Total de r-uplas = " + total);

        sc.close();
    }
}
