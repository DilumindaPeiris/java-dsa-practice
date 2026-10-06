import java.util.Arrays;
import java.util.Random;
import java.util.function.Consumer;

/** Compare implementations against Java's standard sort. */
public class SortingChecks {
    private static int checks;

    private static void check(Consumer<int[]> sorter, int[] input) {
        int[] expected = input.clone();
        int[] actual = input.clone();
        Arrays.sort(expected);
        sorter.accept(actual);
        if (!Arrays.equals(expected, actual)) {
            throw new AssertionError("Unexpected result for " + Arrays.toString(input));
        }
        checks++;
    }

    public static void main(String[] args) {
        int[][] examples = {{}, {7}, {1, 2, 3}, {3, 2, 1},
            {4, 4, 4}, {-3, 0, -1, 2}, {Integer.MAX_VALUE, Integer.MIN_VALUE, 0}};
        Random random = new Random(42);
        for (int trial = 0; trial < 107; trial++) {
            int[] input;
            if (trial < examples.length) input = examples[trial];
            else {
                input = new int[random.nextInt(50)];
                for (int i = 0; i < input.length; i++) input[i] = random.nextInt(201) - 100;
            }
            check(SortingPractice::bubbleSort, input);
            check(SortingPractice::selectionSort, input);
            check(SortingPractice::insertionSort, input);
            check(SortingPractice::mergeSort, input);
        }
        System.out.println("Passed " + checks + " sorting checks.");
    }
}
