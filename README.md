# Phone_Book
### The objective of this project:
Implement several algorithms, and comparing their efficiency when using a big dataset
### Example 1:
```
Start searching (linear search)...
Found 100 / 100 entries. Time taken: 0 min. 0 sec. 6 ms.

Start searching (bubble sort + jump search)...
Found 100 / 100 entries. Time taken: 0 min. 0 sec. 63 ms.
Sorting time: 0 min. 0 sec. 61 ms.
Searching time: 0 min. 0 sec. 2 ms.

Start searching (quick sort + binary search)...
Found 100 / 100 entries. Time taken: 0 min. 0 sec. 3 ms.
Sorting time: 0 min. 0 sec. 2 ms.
Searching time: 0 min. 0 sec. 1 ms.

Start searching (hash table)...
Found 100 / 100 entries. Time taken: 0 min. 0 sec. 2 ms.
Creating time: 0 min. 0 sec. 1 ms.
Searching time: 0 min. 0 sec. 0 ms.
```
### Example 2:
```
Start searching (linear search)...
Found 500 / 500 entries. Time taken: 0 min. 2 sec. 358 ms.

Start searching (bubble sort + jump search)...
Found 500 / 500 entries. Time taken: 0 min. 24 sec. 313 ms.
Sorting time: 0 min. 22 sec. 140 ms. - STOPPED, moved to linear search
Searching time: 0 min. 2 sec. 173 ms.

Start searching (quick sort + binary search)...
Found 500 / 500 entries. Time taken: 0 min. 0 sec. 823 ms.
Sorting time: 0 min. 0 sec. 820 ms.
Searching time: 0 min. 0 sec. 3 ms.

Start searching (hash table)...
Found 500 / 500 entries. Time taken: 0 min. 0 sec. 251 ms.
Creating time: 0 min. 0 sec. 250 ms.
Searching time: 0 min. 0 sec. 1 ms.
```
>If the sorting process takes too long (more than 10 times longer than all 500 iterations of the linear search), you should stop sorting and use the linear search
### Results sortings:
|Sort algorithm                  |Worst-case performance|Best-case performance|Average performance|Sorting time the simplified data|Sorting time the phone numbers of over a million people|
|:------------------------------:|:--------------------:|:-------------------:|:-----------------:|:------------------------------:|:-----------------------------------------------------:|
|:2nd_place_medal: Bubble Sort   |O(n^2)                |O(n)                 |O(n^2)             |0 min. 0 sec. 61 ms.            |> 0 min. 22 sec. 140 ms.                               |
|:1st_place_medal: Quicksort     |O(n^2)                |O(n log n)           |O(n log n)         |0 min. 0 sec. 2 ms.             |0 min. 0 sec. 820 ms.                                  |
### Results searchings:
|Search algorithm                  |Worst-case performance|Best-case performance|Average performance|Searching time the simplified data|Searching time the phone numbers of over a million people|
|:--------------------------------:|:--------------------:|:-------------------:|:-----------------:|:--------------------------------:|:-------------------------------------------------------:|
|Linear search                     |O(n)                  |O(1)                 |O(n/2)             |0 min. 0 sec. 6 ms.               |0 min. 2 sec. 358 ms.                                    |
|:3rd_place_medal: Jump search     |O(√n)                 |O(1)                 |O(√n)              |0 min. 0 sec. 2 ms.               |0 min. 2 sec. 173 ms.                                    |
|:2nd_place_medal: Binary search   |O(log n)              |O(1)                 |O(log n)           |0 min. 0 sec. 1 ms.               |0 min. 0 sec. 3 ms.                                      |
|:1st_place_medal: Hash table      |O(n)                  |O(1)                 |O(1)               |0 min. 0 sec. 0 ms.               |0 min. 0 sec. 1 ms.                                      |
### Results approaches:
|Approache                                  |Time taken with the simplified data|Time taken with the phone numbers of over a million people|
|:-----------------------------------------:|:---------------------------------:|:--------------------------------------------------------:|
|:3rd_place_medal: Linear search            |0 min. 0 sec. 6 ms.                |0 min. 2 sec. 358 ms.                                     |
|Bubble sort + Jump search                  |0 min. 0 sec. 63 ms.               |0 min. 24 sec. 313 ms.                                      |
|:2nd_place_medal: Quicksort + Binary search|0 min. 0 sec. 3 ms.                |0 min. 0 sec. 823 ms.                                     |
|:1st_place_medal: Hash table               |0 min. 0 sec. 2 ms.                |0 min. 0 sec. 251 ms.                                     |
>In the hash table approach, the time taken includes the hash table creation time
