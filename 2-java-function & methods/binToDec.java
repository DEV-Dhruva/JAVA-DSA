import java.util.Scanner;

public class binToDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary number : ");
        int binNum = sc.nextInt();
        int bin_Num = binNum;
        int dec = 0;
        int i = 0;
        while(binNum>0){
        int ld = binNum % 10;
        dec = dec + (ld * (int)Math.pow(2, i));
        i++;
        binNum = binNum / 10;
        }
        System.out.println("decimal number of given binary number "+bin_Num+" is : "+ dec);
        sc.close();
    }
}
