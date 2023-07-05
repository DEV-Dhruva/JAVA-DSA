public class diamondStars {

    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            int sp = n - i;
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            int stars = (2 * i) - 1;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            int sp = n - i;
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            int stars = (2 * i) - 1;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(4);
    }
}
