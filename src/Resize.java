public class Resize {
    public int[] resize(int[] arr, int capacity) {
        int n = arr.length;
        int[] temp = new int[capacity];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
        return arr;
    }

    public static void main(String[] args) {
        Resize re = new Resize();
        int[] arr = {'1', '2', '3', '4'};
        System.out.println("Original size : " + arr.length);
        arr = re.resize(arr, 10);
        System.out.println("After resizing : " + arr.length);
    }
}
