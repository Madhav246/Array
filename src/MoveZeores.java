public class MoveZeores {
    public static void moveZeroes(int[] arr, int n) {
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0) {
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 0, 0, 5, 6, 0};
        int n = arr.length;
        MoveZeores.moveZeroes(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
