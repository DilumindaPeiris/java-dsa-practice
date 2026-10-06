/** Checks linear search with ordered and unordered arrays. */
public class LinearSearchChecks {
    private static int checks;

    private static void check(int[] values, int target, int expectedIndex) {
        int actualIndex = LinearSearch.search(values, target);
        if (actualIndex != expectedIndex) {
            throw new AssertionError("Expected index " + expectedIndex + " for " + target
                    + " but got " + actualIndex);
        }
        checks++;
    }

    public static void main(String[] args) {
        check(new int[]{}, 5, -1);
        check(new int[]{7}, 7, 0);
        check(new int[]{7}, 3, -1);
        check(new int[]{9, -4, 12, 0}, 9, 0);
        check(new int[]{9, -4, 12, 0}, 0, 3);
        check(new int[]{9, -4, 12, 0}, 6, -1);
        check(new int[]{2, 5, 2, 8}, 2, 0);
        check(new int[]{Integer.MAX_VALUE, 0, Integer.MIN_VALUE}, Integer.MIN_VALUE, 2);
        System.out.println("Passed " + checks + " linear search checks.");
    }
}