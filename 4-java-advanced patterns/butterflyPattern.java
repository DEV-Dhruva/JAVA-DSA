public class butterflyPattern {

    public static void printPattern(int n) {
        // 1st half
        for (int i = 1; i <= n; i++) {
            // stars before spaces
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // spaces
            int sp = 2 * (n - i);
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }

            // stars after spaces
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half
        for (int i = n; i >= 1; i--) {
            // stars before spaces
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // spaces
            int sp = 2 * (n - i);
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }

            // stars after spaces
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        printPattern(n);
    }
}
