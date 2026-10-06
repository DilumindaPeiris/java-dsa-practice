import java.util.Arrays;

/** Beginner sorting examples. Each method sorts its input in place. */
public class SortingPractice {
    public static void bubbleSort(int[] values) {
        for (int end = values.length - 1; end > 0; end--) {
            boolean swapped = false;
            for (int i = 0; i < end; i++) {
                if (values[i] > values[i + 1]) {
                    swap(values, i, i + 1);
                    swapped = true;
                }
            }
            if (!swapped) return;
        }
    }

    public static void selectionSort(int[] values) {
        for (int i = 0; i < values.length - 1; i++) {
            int minimum = i;
            for (int j = i + 1; j < values.length; j++) {
                if (values[j] < values[minimum]) minimum = j;
            }
            swap(values, i, minimum);
        }
    }

    public static void insertionSort(int[] values) {
        for (int i = 1; i < values.length; i++) {
            int current = values[i];
            int j = i - 1;
            while (j >= 0 && values[j] > current) {
                values[j + 1] = values[j];
                j--;
            }
            values[j + 1] = current;
        }
    }

    private static void swap(int[] values, int first, int second) {
        int temporary = values[first];
        values[first] = values[second];
        values[second] = temporary;
    }

    public static void main(String[] args) {
        int[] original = {64, 25, 12, 22, 11};
        int[] bubble = original.clone();
        int[] selection = original.clone();
        int[] insertion = original.clone();
        bubbleSort(bubble);
        selectionSort(selection);
        insertionSort(insertion);
        System.out.println("Original:  " + Arrays.toString(original));
        System.out.println("Bubble:    " + Arrays.toString(bubble));
        System.out.println("Selection: " + Arrays.toString(selection));
        System.out.println("Insertion: " + Arrays.toString(insertion));
    }
}
