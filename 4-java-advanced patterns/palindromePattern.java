public class palindromePattern {

    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            int sp = n - i;
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            // descending no's
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // ascending no's
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}
