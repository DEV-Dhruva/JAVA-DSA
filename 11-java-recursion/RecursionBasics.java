public class RecursionBasics {
    public static void printDecreasing(int n) { // num in decreasing order
        if (n == 1) {
            System.out.println(n + " ");
            return;
        }
        System.out.print(n + " ");
        printDecreasing(n - 1);
    }

    public static void printIncreasing(int n) { // num in incresing order
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printIncreasing(n - 1);
        System.out.print(n + " ");
    }

    public static int getFactorial(int n) { // factorial of n numbers
        if (n == 0) {
            return 1;
        }
        int Fnm1 = getFactorial(n - 1);
        int fn = n * Fnm1;
        return fn;
    }

    public static int getSumofN(int n) { // sum of n natural numbers
        if (n == 1) {
            return 1;
        }
        int num = getSumofN(n - 1);
        int sn = n + num;
        return sn;
    }

    public static int fib(int n) { // fibonacci series - space - O(n), time - O(2^n)
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static boolean isSorted(int arr[], int i) { // check array is sorted or not - time/space - O(n)
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return isSorted(arr, i + 1);
    }

    public static int firstOccurrence(int arr[], int key, int i) { // time/space - O(n)
        if (i == arr.length - 1) {
            return -1;
        }
        if (i == key) {
            return i;
        }

        return firstOccurrence(arr, key, i + 1);
    }

    public static int lastOccurrence(int arr[], int key, int i) {
        if (i == arr.length - 1) {
            return -1;
        }

        int isFound = lastOccurrence(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    }

    

    public static void main(String[] args) {
        // printDecreasing(10);
        // System.out.println();
        // printIncreasing(10);
        // System.out.println(getFactorial(5));
        // System.out.println(getSumofN(5));
        // System.out.println(fib(5));
        // int arr[] = { 1, 4, 2, 4 };
        // System.out.println(isSorted(arr, 0));
        // System.out.println(firstOccurrence(arr, 2, 0));
        // System.out.println(lastOccurrence(arr, 2, 0));

    }
}
