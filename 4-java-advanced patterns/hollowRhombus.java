public class hollowRhombus {

    public static void printPattern(int n) {

        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // type-1
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n) {
                    System.out.print("*");
                }
                if (i > 1 && i < n) {
                    if (j == 1 || j == n) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print(" ");
            }

            // type-2
            // for (int j = 1; j <= n; j++) {
            // if (i == 1 || i == n || j == 1 || j == n) {
            // System.out.print("*");
            // } else {
            // System.out.print(" ");
            // }
            // }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        printPattern(5);
    }
}
