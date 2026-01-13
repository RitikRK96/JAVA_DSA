# Pattern Printing (Nested Loops) 🎨

Values logic and flow control understanding are best tested through pattern printing. This folder contains solutions to various standard pattern problems.

## 📂 Files Overview

- **`First.java`**: Solid Rectangle.
- **`Second.java`**: Hollow Rectangle.
- **`Third.java`**: Half Pyramid.
- **`Fourth.java`**: Inverted Half Pyramid.
- **`Fifth.java`**: Inverted Half Pyramid (Rotated 180 deg).
- **`Sixth.java`**: Half Pyramid with Numbers.
- **`Seventh.java`**: Inverted Half Pyramid with Numbers.
- **`Eighth.java`**: Floyd's Triangle.
- **`Ninth.java`**: 0-1 Triangle.
- **`Tenth.java`**: Solid Rhombus.
- **`Solid_Rhombus.java`**: Alternative Solid Rhombus implementation.
- **`HollowRhomhus.java`**: Hollow Rhombus (only border stars).
- **`Diamond.java`**: Diamond Pattern (Upper + Lower pyramid).
- **`Butterfly.java`**: Butterfly Pattern (Stars mirroring each other).
- **`NumberPyramid.java`**: Pyramid with row numbers (`1`, `2 2`, `3 3 3`).
- **`PalindromicPyramid.java`**: Palindromic numbers (`1`, `2 1 2`, `3 2 1 2 3`).

---

## 📘 Tutorial: How to Solve Patterns

Pattern problems almost always use **Nested Loops** (a loop inside another loop). To solve any pattern, follow these 3 steps:

### The Golden Rules

1.  **Outer Loop (`i`)**: Usually runs for the **Rows**. Count how many lines/rows the pattern has.
2.  **Inner Loop (`j`)**: Runs for the **Columns**. Figure out what needs to be printed in each row (stars, spaces, or numbers).
3.  **The Relation**: Find the relation between `i` (row number) and `j` (what is printed).

### Example 1: Solid Rectangle

```
* * * * *
* * * * *
* * * * *
* * * * *
```

- **Rows**: 4 rows -> Outer loop `i` runs 1 to 4.
- **Cols**: 5 stars per row -> Inner loop `j` runs 1 to 5.

```java
for(int i=1; i<=4; i++) {
    for(int j=1; j<=5; j++) {
        System.out.print("* "); // use print, NOT println
    }
    System.out.println(); // move to next line after printing 5 stars
}
```

### Example 2: Half Pyramid

```
*
* *
* * *
* * * *
```

- **Logic**:
  - Row 1: 1 star
  - Row 2: 2 stars
  - Row 3: 3 stars
  - ...
  - Row `i`: `i` stars.
- **Inner Loop Condition**: `j` runs from 1 to `i`.

```java
int n = 4;
for(int i=1; i<=n; i++) {
    for(int j=1; j<=i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

### Example 3: Inverted Half Pyramid

```
* * * *
* * *
* *
*
```

- **Logic**:
  - Row 1: 4 stars (`n`)
  - Row 2: 3 stars (`n-1`)
  - Row `i`: `n - i + 1` stars.

```java
for(int i=1; i<=n; i++) {
    for(int j=1; j <= n-i+1; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

### Example 4: Inverted & Rotated Half Pyramid

```
      *
    * *
  * * *
* * * *
```

- **Logic**:
  - Requires **two** inner loops: one for **Spaces** and one for **Stars**.
  - Row 1: 3 spaces (`n-1`), 1 star.
  - Row 2: 2 spaces (`n-2`), 2 stars.
  - Row `i`: `n-i` spaces, `i` stars.

```java
for(int i=1; i<=n; i++) {
    // Print Spaces
    for(int j=1; j<=n-i; j++) {
        System.out.print("  ");
    }
    // Print Stars
    for(int j=1; j<=i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

### Example 5: Floyd's Triangle

```
1
2 3
4 5 6
7 8 9 10
```

- **Logic**:
  - Similar to Half Pyramid but prints a **counter** variable that keeps increasing.
  - `number` starts at 1 and increments `number++` after every print.

```java
int number = 1;
for(int i=1; i<=n; i++) {
    for(int j=1; j<=i; j++) {
        System.out.print(number + " ");
        number++;
    }
    System.out.println();
}
```

### Example 6: 0-1 Triangle

```
1
0 1
1 0 1
0 1 0 1
```

- **Logic**:
  - Print `1` if the sum of row and col index (`i+j`) is **Even**.
  - Print `0` if the sum is **Odd**.

```java
for(int i=1; i<=n; i++) {
    for(int j=1; j<=i; j++) {
        if((i+j) % 2 == 0) {
            System.out.print("1 "); // Even Sum -> 1
        } else {
           System.out.print("0 "); // Odd Sum -> 0
        }
    }
    System.out.println();
}
```

### Example 7: Butterfly Pattern

```
*             *
* *         * *
* * *     * * *
* * * * * * * *
* * * * * * * *
* * *     * * *
* *         * *
*             *
```

- **Logic**: Divided into **Upper Half** and **Lower Half**.
- **Upper Half (levels `1` to `n`)**:
  - Returns `i` stars, `2*(n-i)` spaces, `i` stars.
- **Lower Half (levels `n` to `1`)**:
  - Same logic but loop runs backwards from `n` to `1`.

### Example 8: Solid Rhombus

```
        * * * * *
      * * * * *
    * * * * *
  * * * * *
* * * * *
```

- **Logic**:
  - Print `n-i` spaces.
  - Print `n` stars (fixed number of stars).

```java
for(int i=1; i<=n; i++) {
    // Spaces
    for(int j=1; j<=n-i; j++) {
        System.out.print("  ");
    }
    // Stars
    for(int j=1; j<=5; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

### Example 9: Number Pyramid

```
    1
   2 2
  3 3 3
 4 4 4 4
```

- **Logic**:
  - **Spaces**: `n-i`
  - **Numbers**: Print row number `i`, `i` times. Add a space after the number to make it look like a pyramid.

```java
for(int i=1; i<=n; i++) {
    for(int j=1; j<=n-i; j++) {
        System.out.print(" ");
    }
    for(int j=1; j<=i; j++) {
        System.out.print(i + " ");
    }
    System.out.println();
}
```

### Example 10: Palindromic Pyramid

```
    1
   212
  32123
 4321234
```

- **Logic**:
  - Spaces: `n-i`.
  - First Part (Decr): Print `i` down to `1`.
  - Second Part (Incr): Print `2` up to `i`.

```java
for(int i=1; i<=n; i++) {
    // Spaces
    for(int j=1; j<=n-i; j++) {
        System.out.print("  ");
    }
    // 1st half: i to 1
    for(int j=i; j>=1; j--) {
        System.out.print(j + " ");
    }
    // 2nd half: 2 to i
    for(int j=2; j<=i; j++) {
        System.out.print(j + " ");
    }
    System.out.println();
}
```

### Tips for Complex Patterns

- **Spaces**: Sometimes you need to print spaces _before_ the stars (e.g., Pyramids). Treat spaces as a separate inner loop before the star loop.
- **Matrix Coordinates**: Think of the pattern as a grid (i, j).
