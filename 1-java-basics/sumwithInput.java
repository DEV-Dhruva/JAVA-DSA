import java.util.*;

public class sumwithInput{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int $ = sc.nextInt();
        int sum = a+$;
        System.out.print(sum);
        sc.close();
    }
}