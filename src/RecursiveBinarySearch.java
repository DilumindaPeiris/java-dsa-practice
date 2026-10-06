/** Recursive binary search for an ascending, sorted integer array. */
public class RecursiveBinarySearch {
    /** Returns an index containing target, or -1 when target is absent. */
    public static int search(int[] sortedValues, int target) {
        return search(sortedValues, target, 0, sortedValues.length - 1);
    }

    private static int search(int[] sortedValues, int target, int low, int high) {
        if (low > high) return -1;

        int middle = low + (high - low) / 2;
        if (sortedValues[middle] == target) return middle;
        if (sortedValues[middle] < target) {
            return search(sortedValues, target, middle + 1, high);
        }
        return search(sortedValues, target, low, middle - 1);
    }
}