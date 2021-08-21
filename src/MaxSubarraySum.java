//Kardane's Alogrithm :
public class MaxSubarraySum {
    public static int maxSubArray(int[] arr, int n) {
        int maxSoFar = arr[0];
        int currentMax = arr[0];

        for (int i = 1; i < n; i++) {
            currentMax = currentMax + arr[i];  //

            if (currentMax < arr[i]) {         // currentMax = Math.max(currentMax + arr[i], arr[i]);
                currentMax = arr[i];           //
            }

            if (maxSoFar < currentMax) {
                maxSoFar = currentMax;
            }
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] arr = {1,12,-5,-6,50,3};
        int n = arr.length;

        System.out.println(MaxSubarraySum.maxSubArray(arr, n));

    }
}
