public class binarySearch {

    public static int bs(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == numbers[mid]) {
                return mid;
            } else if (key > numbers[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 14, 16 };
        int key = 14;
        System.out.println("key is found at : " + bs(numbers, key));
    }
}

// time complexity : O(n) is log(n)
