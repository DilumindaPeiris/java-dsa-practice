/** Linear search for a target in any integer array. */
public class LinearSearch {
    /** Returns the first index containing target, or -1 when target is absent. */
    public static int search(int[] values, int target) {
        for (int index = 0; index < values.length; index++) {
            if (values[index] == target) return index;
        }
        return -1;
    }
}