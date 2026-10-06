/** Two-pointer pair-sum search for an ascending, sorted integer array. */
public class PairSum {
    /** Returns whether two distinct elements sum to target. */
    public static boolean containsPairWithSum(int[] sortedValues, int target) {
        int left = 0;
        int right = sortedValues.length - 1;

        while (left < right) {
            long sum = (long) sortedValues[left] + sortedValues[right];
            if (sum == target) return true;
            if (sum < target) left++;
            else right--;
        }
        return false;
    }
}