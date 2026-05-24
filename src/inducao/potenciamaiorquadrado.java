import java.util.Scanner;

public class potenciamaiorquadrado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite n: ");
        int n = sc.nextInt();

        double potencia = Math.pow(2, n);
        double quadrado = Math.pow(n, 2);

        System.out.println("2^n = " + potencia);
        System.out.println("n^2 = " + quadrado);

        if (potencia > quadrado) {
            System.out.println("2^n > n^2");
        } else {
            System.out.println("2^n <= n^2");
        }

        sc.close();
    }
}
