import java.util.Scanner;

public class decToBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Decimal Number : ");
        int decNum = sc.nextInt();
        int dec_Num = decNum;
        int binNum = 0;
        int i = 0;
        while (decNum > 0) {
            int rem = decNum % 2;
            binNum = binNum + (rem * (int) Math.pow(10, i));
            i++;
            decNum = decNum / 2;
        }

        System.out.println("The Binary Number for given Decimal Number "+dec_Num+" is : "+binNum);

        sc.close();
    }
}
