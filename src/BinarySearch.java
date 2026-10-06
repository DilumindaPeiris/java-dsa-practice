/** Binary search for values in an ascending, sorted integer array. */
public class BinarySearch {
    /** Returns an index containing target, or -1 when target is absent. */
    public static int search(int[] sortedValues, int target) {
        int low = 0;
        int high = sortedValues.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (sortedValues[middle] == target) return middle;
            if (sortedValues[middle] < target) low = middle + 1;
            else high = middle - 1;
        }
        return -1;
    }
}