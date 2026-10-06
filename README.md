# Java DSA Practice

A growing collection of data structures and algorithms implemented in Java.
The project includes three sorting algorithms checked against Java's built-in
sort, plus merge sort, quicksort, linear and binary search, and a two-pointer
pair-sum check, all with executable checks.

## Implemented algorithms

| Algorithm | Best time | Average time | Worst time | Extra space |
| --- | --- | --- | --- | --- |
| Bubble sort (early exit) | O(n) | O(n²) | O(n²) | O(1) |
| Selection sort | O(n²) | O(n²) | O(n²) | O(1) |
| Insertion sort | O(n) | O(n²) | O(n²) | O(1) |
| Merge sort | O(n log n) | O(n log n) | O(n log n) | O(n) |
| Quicksort | O(n log n) | O(n log n) | O(n²) | O(log n) stack |
| Linear search | O(1) | O(n) | O(n) | O(1) |
| Binary search | O(1) | O(log n) | O(log n) | O(1) |
| Recursive binary search | O(1) | O(log n) | O(log n) | O(log n) |
| Pair sum (sorted array) | O(1) | O(n) | O(n) | O(1) |

The sorting implementations sort an integer array in place, in ascending
order. Merge sort uses additional O(n) space. Quicksort sorts in place and
recurses on the smaller partition to keep its stack use O(log n). Linear search accepts any
non-null integer array and returns the first
matching index, or -1 if the target is absent. Binary search requires a
non-null array already sorted in ascending order and returns a matching index,
or -1 if the target is absent. Recursive binary search has the same input
requirements and result, using O(log n) call-stack space. The sorting demo
clones the original array so each algorithm receives the same input.
Pair-sum search requires a non-null array sorted in ascending order and checks
whether two distinct elements sum to the target.

## Implemented data structures

`IntArrayStack` is a fixed-capacity integer stack. Push, pop, peek, size, and
empty checks take O(1) time; backing storage uses O(capacity) space. A
non-positive capacity is rejected, and pushing to a full stack or popping or
peeking at an empty stack throws `IllegalStateException`.

## Run locally

Install JDK 17 or newer (a JRE alone does not include the compiler).
Open a terminal in this project folder:

```sh
javac -d out src/*.java
java -cp out SortingPractice
java -cp out SortingChecks
java -cp out LinearSearchChecks
java -cp out BinarySearchChecks
java -cp out RecursiveBinarySearchChecks
java -cp out PairSumChecks
java -cp out IntArrayStackChecks
```

Expected demo output:

```text
Original:  [64, 25, 12, 22, 11]
Bubble:    [11, 12, 22, 25, 64]
Selection: [11, 12, 22, 25, 64]
Insertion: [11, 12, 22, 25, 64]
Merge:     [11, 12, 22, 25, 64]
Quick:     [11, 12, 22, 25, 64]
```

Sorting checks cover empty arrays, one element, sorted and reversed input,
duplicates, negative numbers, integer extremes, and reproducible random arrays.
Binary search checks cover empty and one-element arrays, boundaries, missing
values, duplicates, negative numbers, and integer extremes. Linear search
checks cover empty and one-element arrays, unsorted input, boundaries, missing
values, duplicates, and integer extremes. GitHub Actions compiles and runs all
six check suites on pushes and pull requests.

## Learning exercises

- Trace each algorithm on paper with the demo input.
- Explain why bubble sort can stop when a pass makes no swaps.
- Count comparisons and swaps, then compare the algorithms.
- Compare binary and linear search on arrays that are sorted and unsorted.
- Implement an array-backed queue after completing the stack exercise.

Commit completed improvements with descriptive messages. Record only work
actually completed; the exercises above are future tasks.
