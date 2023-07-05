import java.util.Scanner;

public class twoDimArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows :");
        int n = sc.nextInt();
        System.out.print("Enter no of columns :");
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];
        for (int i = 0; i < matrix.length; i++) { // input
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < matrix.length; i++) { // output
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
