/** Checks recursive binary search on sorted arrays. */
public class RecursiveBinarySearchChecks {
    private static int checks;

    private static void check(int[] sortedValues, int target, boolean expectedFound) {
        int index = RecursiveBinarySearch.search(sortedValues, target);
        if (expectedFound) {
            if (index < 0 || sortedValues[index] != target) {
                throw new AssertionError("Search failed to find " + target);
            }
        } else if (index != -1) {
            throw new AssertionError("Search unexpectedly found " + target);
        }
        checks++;
    }

    public static void main(String[] args) {
        check(new int[]{}, 5, false);
        check(new int[]{7}, 7, true);
        check(new int[]{7}, 3, false);
        check(new int[]{-10, -3, 0, 4, 8, 15}, -10, true);
        check(new int[]{-10, -3, 0, 4, 8, 15}, 15, true);
        check(new int[]{-10, -3, 0, 4, 8, 15}, 4, true);
        check(new int[]{-10, -3, 0, 4, 8, 15}, 5, false);
        check(new int[]{Integer.MIN_VALUE, 0, Integer.MAX_VALUE}, Integer.MIN_VALUE, true);
        check(new int[]{Integer.MIN_VALUE, 0, Integer.MAX_VALUE}, Integer.MAX_VALUE, true);
        check(new int[]{1, 2, 2, 2, 3}, 2, true);
        System.out.println("Passed " + checks + " recursive binary search checks.");
    }
}