import java.util.Scanner;

public class primeNo{
    public static void main(String[] args) {
        // prime number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        boolean check = false;

        if(n==2){
            check = true;
        }

        // for(int i=2;i<=n-1;i++){
        //     if(n%i==0){
        //         check = false;
        //     }
        //     else{
        //         check = true;
        //     }
        // }

        // optimised way to calc prime no
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                check = false;
            }
            else{
                check = true;
            }
        }

        if(check){
            System.out.println(n + " is a prime number");
        }
        else{
            System.out.println(n + " is not a prime number");
        }
        sc.close();
    }
}