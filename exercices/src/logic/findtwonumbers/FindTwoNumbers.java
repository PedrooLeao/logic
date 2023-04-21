import java.util.HashMap;

public class FindTwoNumbers {

    public static int[] findNumbers(int[] arr, int targetSum) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(targetSum - arr[i])) {
                result[0] = map.get(targetSum - arr[i]);
                result[1] = i;
                return result;
            }
            map.put(arr[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int targetSum = 9;
        int[] result = findNumbers(arr, targetSum);
        if (result.length == 0) {
            System.out.println("No such pair of numbers found.");
        } else {
            System.out.println("Indices of the two numbers are: " + result[0] + ", " + result[1]);
        }
    }
}

