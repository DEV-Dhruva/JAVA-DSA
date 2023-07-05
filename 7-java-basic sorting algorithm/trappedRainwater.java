public class trappedRainwater {

    public static int trappedRW(int height[]) {
        int n = height.length;
        // cal left max boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // cal right max boundary - array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trappedWater = 0;
        // loop
        for (int i = 0; i < n; i++) {
            // waterlevel = min(leftmax bound, rightmax bound)
            int waterlevel = Math.min(leftMax[i], rightMax[i]);

            // trapped water = waterlevel - height[i]
            trappedWater += waterlevel - height[i];
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = { 3,0,0,2,0,4 };
        System.out.println("trapped rainwater is "+trappedRW(height));
    }
}
