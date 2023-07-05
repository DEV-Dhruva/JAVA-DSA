public class numberPyramid {

    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            int sp = n - i;
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            // for (int j = 1; j <= sp; j++) {
            // System.out.print(" ");
            // }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        printPattern(5);
    }
}