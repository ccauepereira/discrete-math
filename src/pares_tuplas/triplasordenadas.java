public class triplasordenadas {

    public static void main(String[] args) {

        String[] a = {"a1", "a2"};
        String[] b = {"b1", "b2"};
        String[] c = {"c1", "c2"};

        int total = 0;

        System.out.println("Triplas ordenadas:");

        for (String x : a) {
            for (String y : b) {
                for (String z : c) {

                    System.out.println("(" + x + ", " + y + ", " + z + ")");
                    total++;
                }
            }
        }

        System.out.println("Total = " + total);
    }
}
