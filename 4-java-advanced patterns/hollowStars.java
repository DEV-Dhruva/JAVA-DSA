import java.util.Scanner;

public class hollowStars {

    public static void printHollowStars(int rows, int cols){

        for(int i=1; i<=rows; i++){
                if(i==1 || i== rows){
                    for(int j=1; j<=cols; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                else{
                    for(int k=1; k<=cols; k++){
                        if(k==1 || k==cols){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of rows:");
        int rows = sc.nextInt();
        System.out.println("enter no. of columns:");
        int cols = sc.nextInt();
        printHollowStars(rows, cols);
        sc.close();
    }
}
