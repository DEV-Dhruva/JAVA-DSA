
public class invAndRotPyramid {

    public static void printinvAndRotPyramid(int x) {
        for(int i=1; i<=x; i++){
            for(int j=1; j<=x-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printinvAndRotPyramid(4);
    }
}
