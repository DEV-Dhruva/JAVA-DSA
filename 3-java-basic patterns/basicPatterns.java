import java.util.Scanner;

public class basicPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of lines : ");
        int str = sc.nextInt();

        //for inverted *
        /* for (int i = 0; i<str; i++) {
            for(int j=str-i; j>0; j--){
                System.out.print("*");
            }

            System.out.println();
        } */

        /* for(int i=1; i<=str; i++){
            for(int j=i; j>0; j--){
                //System.out.print("*");

            System.out.println();
        } */

        /* for(int i=1; i<=str; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }

            System.out.println();
        } */
        
        //int count = 1;
        char charac = 'A';
        for(int i=1; i<=str; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(charac);
                charac++;
            }
            System.out.println();
        }

        
        sc.close();
    }
}
