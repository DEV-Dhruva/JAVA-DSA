import java.util.Scanner;

public class binomCoeff {

    public static int fact(int x){
        int f = 1;
        for(int i=1; i<=x; i++){
            f = f * i;
        }
        return f;
    }

    public static int binoCoef(int n, int r){
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nSubr = fact(n-r);
        int bc = fact_n / (fact_r * fact_nSubr);
        return bc;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Binomial Coefficient :");
        System.out.println("Enter a value for n : ");
        int n = sc.nextInt();
        System.out.println("Enter a value for r : ");
        int r = sc.nextInt();
        System.out.println("Binomial Coefficient for given "+n+" & "+r+" is "+ binoCoef(n,r) );
        sc.close();
    }
}
