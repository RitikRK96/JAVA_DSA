# Time & Space Complexity Analysis ⏳📦

DSA is not just about solving problems; it's about solving them **efficiently**. Time and Space complexity are the yardsticks we use to measure code efficiency.

## 1. Time Complexity ⏳

**Time Complexity is NOT the actual time taken (in seconds)** by an algorithm to run. It is a function representing the relationship between the **Input Size (n)** and the **Number of Operations** performed.

### Why not seconds?

- Depends on hardware (Supercomputer vs. Old Laptop).
- Depends on other running programs.
- Depends on compiler optimizations.

### Big O Notation ($O$)

We usually care about the **Worst Case Scenario** (Upper Bound).

- **Best Case ($\Omega$)**: Minimum time required (rarely useful).
- **Average Case ($\Theta$)**: Average time (complex to calculate).
- **Worst Case ($O$)**: Maximum time required (Standard).

---

## 2. Common Time Complexities (Visualized) 📈

Imagine `n` is the input size (e.g., number of elements in an array).

| Notation          | Name               | Speed        | Example                        | Visualization            |
| :---------------- | :----------------- | :----------- | :----------------------------- | :----------------------- |
| **$O(1)$**        | Constant           | ⚡ Fastest   | Accessing array index `arr[5]` | `______` (Flat line)     |
| **$O(\log n)$**   | Logarithmic        | 🚄 Very Fast | Binary Search                  | `-----.` (Slowly rising) |
| **$O(n)$**        | Linear             | 🏃 Fast      | Simple For Loop                | `/` (Straight diagonal)  |
| **$O(n \log n)$** | Linear Logarithmic | 🚶 Decent    | Sorting (Merge Sort)           | `_/` (Steep diagonal)    |
| **$O(n^2)$**      | Quadratic          | 🐢 Slow      | Nested Loops (Bubble Sort)     | `J` (Curve up)           |
| **$O(2^n)$**      | Exponential        | 🐌 Very Slow | Recursion (Fibonacci)          | `\|` (Rocket up)         |

---

## 3. Detailed Explanations with Code

### $O(1)$ - Constant Time

No matter how much data (`n`), the operation takes the same time.

```java
// Logic: Just one calculation. n doesn't matter.
void printFirst(int[] arr) {
    System.out.println(arr[0]);
}
```

### $O(n)$ - Linear Time

Time grows linearly with input. If `n` doubles, time doubles.

```java
// Logic: Loop runs n times.
void printAll(int[] arr) {
    for(int i=0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
}
```

### $O(n^2)$ - Quadratic Time

Time grows quadratically. If `n` doubles, time quadruples ($2^2 = 4$).
Common with **Nested Loops**.

```java
// Logic: For every i, j runs n times. Total = n * n
void printPairs(int[] arr) {
    for(int i=0; i < n; i++) {       // Runs n times
        for(int j=0; j < n; j++) {   // Runs n times
            System.out.println(i + " " + j);
        }
    }
}
```

### $O(\log n)$ - Logarithmic Time

Time grows very slowly. Usually happens when we **divide the problem or input in half** at every step (like Binary Search).

```java
// Logic: i becomes 2, 4, 8, 16... reaches n quickly.
// Steps approx equal to log2(n)
while(n > 1) {
    n = n / 2;
}
```

---

## 4. Space Complexity 📦

**Space Complexity** is the total amount of memory space used by an algorithm, including the space of input values, for execution.

**Formula**:
`Space Complexity = Auxiliary Space + Input Space`

- **Auxiliary Space**: Extra space or temporary space used by an algorithm.
- **Input Space**: Space used by the input.

### Examples

#### $O(1)$ Space

We only use a few variables, regardless of `n`.

```java
int sum(int[] arr) {
    int total = 0; // One variable
    for(int i : arr) total += i;
    return total;
}
```

#### $O(n)$ Space

We create a new structure of size `n`.

```java
int[] copyArray(int[] arr, int n) {
    int[] newArr = new int[n]; // O(n) space created
    for(int i=0; i<n; i++) newArr[i] = arr[i];
    return newArr;
}
```

---

## 5. Cheat Sheet 📝

| n          | O(1) | O(log n) | O(n) | O(n log n) | O(n^2) |
| :--------- | :--- | :------- | :--- | :--------- | :----- |
| **10**     | 1    | 3        | 10   | 30         | 100    |
| **100**    | 1    | 6        | 100  | 600        | 10,000 |
| **10,000** | 1    | 13       | 10k  | 130k       | 100M!  |

> **Tip**: Always try to optimize your solution from $O(n^2) \to O(n \log n) \to O(n)$.
