public class FindMissingNumber {
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        for (int num : arr) {
            sum = sum - num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 7, 3};
        System.out.println(FindMissingNumber.findMissingNumber(arr));
    }
}
