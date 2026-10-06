/** Checks two-pointer pair-sum search on sorted arrays. */
public class PairSumChecks {
    private static int checks;

    private static void check(int[] sortedValues, int target, boolean expected) {
        boolean actual = PairSum.containsPairWithSum(sortedValues, target);
        if (actual != expected) {
            throw new AssertionError("Unexpected pair-sum result for target " + target);
        }
        checks++;
    }

    public static void main(String[] args) {
        check(new int[]{}, 0, false);
        check(new int[]{4}, 8, false);
        check(new int[]{1, 2, 4, 7}, 9, true);
        check(new int[]{1, 2, 4, 7}, 15, false);
        check(new int[]{2, 2}, 4, true);
        check(new int[]{-8, -3, 1, 6}, -2, true);
        check(new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE}, -1, true);
        check(new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE}, -2, false);
        check(new int[]{-1, 0}, -1, true);
        System.out.println("Passed " + checks + " pair-sum checks.");
    }
}