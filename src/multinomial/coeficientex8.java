public class coeficientex8 {

    public static long fatorial(int n) {

        long resultado = 1;

        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }

        return resultado;
    }

    public static long multinomial(int a, int b, int c) {

        return fatorial(9) /
                (fatorial(a) * fatorial(b) * fatorial(c));
    }

    public static void main(String[] args) {

        long soma = 0;

        for (int a = 0; a <= 9; a++) {

            for (int b = 0; b <= 9; b++) {

                for (int c = 0; c <= 9; c++) {

                    if (a + b + c == 9) {

                        int expoente = (2 * b) + (3 * c);

                        if (expoente == 8) {

                            long valor = multinomial(a, b, c);

                            soma += valor;

                            System.out.println(
                                    "a=" + a +
                                    " b=" + b +
                                    " c=" + c +
                                    " -> " + valor
                            );
                        }
                    }
                }
            }
        }

        System.out.println("Coeficiente total = " + soma);
    }
}
