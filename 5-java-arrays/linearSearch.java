public class linearSearch {

    public static int ls(int numbers[] , int key){
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 10;
        int result = ls(numbers, key);
        if (result == -1) {
            System.out.println("Not Found.");
        } else {
            System.out.println("Key is found at index : " + result);
        }
    }
}

//time complexity : O(n) = n
