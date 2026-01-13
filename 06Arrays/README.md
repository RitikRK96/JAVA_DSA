# Arrays in Java 📦

Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value. They are fixed-size, continuous memory structures.

## 📂 Files Overview

- **`Array.java`**: Logic for 1D Arrays.
  - Creating and Initializing arrays.
  - Taking input from the user (Scanner).
  - **Linear Search**: Finding an element by traversing the array.
- **`TwoDArrays.java`**: Logic for 2D Arrays (Matrices).
  - Creating a matrix (rows & columns).
  - Nested loops for printing and searching.

---

## 📘 Tutorial: Arrays 🎨

### 1. What is an Array?

An array is a collection of elements of the **same type** placed in **contiguous memory locations**.

- **Index**: The position of an element. **Starts from `0`**.
- **Length**: Total number of elements.

### 2. 1D Arrays (Linear)

Think of an array like a row of mailboxes. Each box has a unique number (Index).

**Visual Representation:**

```text
int[] marks = {90, 80, 70, 60, 50};

Index:     0      1      2      3      4
        +------+------+------+------+------+
Data:   |  90  |  80  |  70  |  60  |  50  |
        +------+------+------+------+------+
Length: 5
```

**Syntax**:

```java
// Declaration & Memory Allocation
type[] arrayName = new type[size];

// Example
int[] marks = new int[5]; // Array of size 5
```

**Memory**:
If `int` takes 4 bytes, an array of size 5 takes `5 * 4 = 20 bytes` continuously in memory.

### 3. 2D Arrays (Matrix) 🕸️

Think of it as a grid or a table with **Rows** and **Columns**. It is essentially an "Array of Arrays".

**Visual Representation:**

```text
int[][] matrix = new int[3][3]; (3 Rows, 3 Cols)

       Col 0    Col 1    Col 2
      +-------+-------+-------+
Row 0 | (0,0) | (0,1) | (0,2) |
      +-------+-------+-------+
Row 1 | (1,0) | (1,1) | (1,2) |
      +-------+-------+-------+
Row 2 | (2,0) | (2,1) | (2,2) |
      +-------+-------+-------+
```

**Memory Representation (How Computer sees it):**
In reality, computer memory is 1D. A 2D array is stored row-by-row linearly.

```text
Memory Adr:  [Row 0 Data] -> [Row 1 Data] -> [Row 2 Data] ...
```

**Accessing Elements**:
`arr[i][j]` -> Element at Row `i` and Column `j`.

### 4. Search Algorithms

#### Linear Search

The simplest way to find an element.

- **Visual Logic**:
  ```text
  Target: 70
  Array: [90, 80, 70, 60]
           ^   ^   ^
          No  No  YES! (Found at Index 2)
  ```
- **Time Complexity**: $O(n)$ (Linear time).

```java
// Searching for 'x'
for(int i=0; i<arr.length; i++) {
    if(arr[i] == x) {
        System.out.println("Found at index " + i);
    }
}
```
