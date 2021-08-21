import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {
    public static int[] twoSum(int[] arr, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(target - arr[i])) {
                map.put(arr[i], i);
            }

            else {
                result[1] = i;
                result[0] = map.get(target - arr[i]);
                return result;
            }
        }

        throw new IllegalArgumentException("Two numbers not found");
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 11, 5, 10, 7, 8};
        int[] result = twoSum(arr, 9);
        System.out.println(result[0] + " " + result[1]);
    }
}
