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

    public static void mergeSort(int[] values) {
        mergeSort(values, 0, values.length - 1);
    }

    private static void mergeSort(int[] values, int low, int high) {
        if (low >= high) return;

        int middle = low + (high - low) / 2;
        mergeSort(values, low, middle);
        mergeSort(values, middle + 1, high);
        merge(values, low, middle, high);
    }

    private static void merge(int[] values, int low, int middle, int high) {
        int[] merged = new int[high - low + 1];
        int left = low;
        int right = middle + 1;
        int destination = 0;

        while (left <= middle && right <= high) {
            if (values[left] <= values[right]) merged[destination++] = values[left++];
            else merged[destination++] = values[right++];
        }
        while (left <= middle) merged[destination++] = values[left++];
        while (right <= high) merged[destination++] = values[right++];
        System.arraycopy(merged, 0, values, low, merged.length);
    }

    public static void quickSort(int[] values) {
        quickSort(values, 0, values.length - 1);
    }

    private static void quickSort(int[] values, int low, int high) {
        while (low < high) {
            int left = low;
            int right = high;
            int pivot = values[low + (high - low) / 2];

            while (left <= right) {
                while (values[left] < pivot) left++;
                while (values[right] > pivot) right--;
                if (left <= right) swap(values, left++, right--);
            }

            if (right - low < high - left) {
                if (low < right) quickSort(values, low, right);
                low = left;
            } else {
                if (left < high) quickSort(values, left, high);
                high = right;
            }
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
        int[] merge = original.clone();
        int[] quick = original.clone();
        bubbleSort(bubble);
        selectionSort(selection);
        insertionSort(insertion);
        mergeSort(merge);
        quickSort(quick);
        System.out.println("Original:  " + Arrays.toString(original));
        System.out.println("Bubble:    " + Arrays.toString(bubble));
        System.out.println("Selection: " + Arrays.toString(selection));
        System.out.println("Insertion: " + Arrays.toString(insertion));
        System.out.println("Merge:     " + Arrays.toString(merge));
        System.out.println("Quick:     " + Arrays.toString(quick));
    }
}
