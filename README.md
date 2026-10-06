# Java DSA Practice

A growing collection of data structures and algorithms implemented in Java.
The project includes three sorting algorithms checked against Java's built-in
sort, plus linear and binary search with executable checks.

## Implemented algorithms

| Algorithm | Best time | Average time | Worst time | Extra space |
| --- | --- | --- | --- | --- |
| Bubble sort (early exit) | O(n) | O(n²) | O(n²) | O(1) |
| Selection sort | O(n²) | O(n²) | O(n²) | O(1) |
| Insertion sort | O(n) | O(n²) | O(n²) | O(1) |
| Linear search | O(1) | O(n) | O(n) | O(1) |
| Binary search | O(1) | O(log n) | O(log n) | O(1) |

The sorting implementations sort an integer array in place, in ascending
order. Linear search accepts any non-null integer array and returns the first
matching index, or -1 if the target is absent. Binary search requires a
non-null array already sorted in ascending order and returns a matching index,
or -1 if the target is absent. The sorting demo clones the original array so
each algorithm receives the same input.

## Run locally

Install JDK 17 or newer (a JRE alone does not include the compiler).
Open a terminal in this project folder:

```sh
javac -d out src/SortingPractice.java src/SortingChecks.java
java -cp out SortingPractice
java -cp out SortingChecks
java -cp out LinearSearchChecks
java -cp out BinarySearchChecks
```

Expected demo output:

```text
Original:  [64, 25, 12, 22, 11]
Bubble:    [11, 12, 22, 25, 64]
Selection: [11, 12, 22, 25, 64]
Insertion: [11, 12, 22, 25, 64]
```

Sorting checks cover empty arrays, one element, sorted and reversed input,
duplicates, negative numbers, integer extremes, and reproducible random arrays.
Binary search checks cover empty and one-element arrays, boundaries, missing
values, duplicates, negative numbers, and integer extremes. Linear search
checks cover empty and one-element arrays, unsorted input, boundaries, missing
values, duplicates, and integer extremes. GitHub Actions compiles and runs all
three check suites on pushes and pull requests.

## Learning exercises

- Trace each algorithm on paper with the demo input.
- Explain why bubble sort can stop when a pass makes no swaps.
- Count comparisons and swaps, then compare the algorithms.
- Compare binary and linear search on arrays that are sorted and unsorted.
- Implement a stack and queue after completing the sorting exercises.

Commit completed improvements with descriptive messages. Record only work
actually completed; the exercises above are future tasks.
