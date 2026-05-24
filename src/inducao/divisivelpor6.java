import java.util.Scanner;

public class divisivelpor6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite n: ");
        int n = sc.nextInt();

        long resultado = (long) Math.pow(7, n) - 1;

        System.out.println("Resultado = " + resultado);

        if (resultado % 6 == 0) {
            System.out.println("Divisivel por 6.");
        } else {
            System.out.println("Nao divisivel.");
        }

        sc.close();
    }
}
