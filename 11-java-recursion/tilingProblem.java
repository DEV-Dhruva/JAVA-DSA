public class tilingProblem {

    public static int tiling(int n) { // 2xn tile floor
        if (n == 0 || n == 1) {
            return 1;
        }
        int fnm1 = tiling(n - 1);
       
        int fnm2 = tiling(n - 2);
        
        int totalWays = fnm1 + fnm2;
      
        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(tiling(3));
    }
}
