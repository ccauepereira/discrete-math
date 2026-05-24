public class relacaobinaria {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};

        System.out.println("Relacao R:");

        for (int x : a) {
            for (int y : a) {

                if (x + y <= 5) {
                    System.out.println("(" + x + ", " + y + ")");
                }
            }
        }
    }
}
