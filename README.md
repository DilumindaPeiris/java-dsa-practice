# Java DSA Practice

A growing collection of data structures and algorithms implemented in Java.
The first module compares three sorting algorithms with readable code and
checks against Java's built-in sort.

## Implemented algorithms

| Algorithm | Best time | Average time | Worst time | Extra space |
| --- | --- | --- | --- | --- |
| Bubble sort (early exit) | O(n) | O(n²) | O(n²) | O(1) |
| Selection sort | O(n²) | O(n²) | O(n²) | O(1) |
| Insertion sort | O(n) | O(n²) | O(n²) | O(1) |

All three implementations sort an integer array in place, in ascending order.
Use non-null arrays. The demo clones the original array so each algorithm
receives the same input.

## Run locally

Install JDK 17 or newer (a JRE alone does not include the compiler).
Open a terminal in this project folder:

```sh
javac -d out src/SortingPractice.java src/SortingChecks.java
java -cp out SortingPractice
java -cp out SortingChecks
```

Expected demo output:

```text
Original:  [64, 25, 12, 22, 11]
Bubble:    [11, 12, 22, 25, 64]
Selection: [11, 12, 22, 25, 64]
Insertion: [11, 12, 22, 25, 64]
```

The checks cover empty arrays, one element, sorted and reversed input,
duplicates, negative numbers, integer extremes, and reproducible random arrays.
GitHub Actions compiles and runs these checks on pushes and pull requests.

## Learning exercises

- Trace each algorithm on paper with the demo input.
- Explain why bubble sort can stop when a pass makes no swaps.
- Count comparisons and swaps, then compare the algorithms.
- Add linear search, then binary search with documented input requirements.
- Implement a stack and queue after completing the sorting exercises.

Commit completed improvements with descriptive messages. Record only work
actually completed; the exercises above are future tasks.
