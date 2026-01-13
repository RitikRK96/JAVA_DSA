# Pattern Printing (Nested Loops) 🎨

Values logic and flow control understanding are best tested through pattern printing. This folder contains solutions to various standard pattern problems.

## 📂 Files Overview

- **Basic Shapes**: `First.java` (Rectangle), `Second.java` (Hollow Rectangle), etc.
- **Pyramids**: `NumberPyramid.java`, `PalindromicPyramid.java`.
- **Advanced**: `Butterfly.java`, `Diamond.java`, `Solid_Rhombus.java`.

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

### Tips for Complex Patterns

- **Spaces**: Sometimes you need to print spaces _before_ the stars (e.g., Pyramids). Treat spaces as a separate inner loop before the star loop.
- **Matrix Coordinates**: Think of the pattern as a grid (i, j).
