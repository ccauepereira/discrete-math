public class ordemparcial {

    public static void main(String[] args) {

        int[] a = {1, 2, 3};

        boolean reflexiva = true;
        boolean antissimetrica = true;
        boolean transitiva = true;

        for (int x : a) {

            if (!(x <= x)) {
                reflexiva = false;
            }
        }

        for (int x : a) {
            for (int y : a) {

                if ((x <= y) && (y <= x) && (x != y)) {
                    antissimetrica = false;
                }
            }
        }

        for (int x : a) {
            for (int y : a) {
                for (int z : a) {

                    if ((x <= y) && (y <= z) && !(x <= z)) {
                        transitiva = false;
                    }
                }
            }
        }

        System.out.println("Reflexiva: " + reflexiva);
        System.out.println("Antissimetrica: " + antissimetrica);
        System.out.println("Transitiva: " + transitiva);
    }
}
