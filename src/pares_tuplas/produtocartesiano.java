public class produtocartesiano {

    public static void main(String[] args) {

        String[] a = {"a1", "a2"};
        String[] b = {"b1", "b2", "b3"};

        System.out.println("A x B:");

        for (String x : a) {
            for (String y : b) {
                System.out.println("(" + x + ", " + y + ")");
            }
        }
    }
}
