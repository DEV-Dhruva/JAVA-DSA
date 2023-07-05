public class reverseArray {

    public static int reverse(int numbers[]) {
        int start = 0, end = numbers.length - 1;
        while (start < end) {
            int temp = numbers[end];
            numbers[end] = numbers[start];
            numbers[start] = temp;
            start++;
            end--;
        }
        return -1;

    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        reverse(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}

// time complexity is n and space complexity is 1(const)
