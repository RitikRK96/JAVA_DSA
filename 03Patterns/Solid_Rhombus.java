public class Solid_Rhombus {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i < 2 * n; i++) {
            for (int j = 1; j < n; j++) {
                // for spaces
                if (i == n) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
