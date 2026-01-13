# Loops in Java

This folder covers the iterative control structures (loops) used to execute a block of code repeatedly.

## Topics Covered

### 1. For Loop (`For.java`)

- **Use case**: When the number of iterations is known beforehand.
- **Syntax**: `for (initialization; condition; update) { ... }`

### 2. While Loop (`While.java`)

- **Use case**: When the number of iterations is not known, but the loop terminates based on a condition.
- **Key Feature**: Entry-controlled loop (checks condition _before_ execution).

### 3. Do-While Loop (`DoWhile.java`)

- **Use case**: Similar to while loop, but guarantees at least one execution.
- **Key Feature**: Exit-controlled loop (checks condition _after_ execution).

## Comparison

| Loop Type    | Entry/Exit Control | Min Iterations | Best For                                     |
| :----------- | :----------------- | :------------- | :------------------------------------------- |
| **For**      | Entry              | 0              | Known number of iterations                   |
| **While**    | Entry              | 0              | Unknown iterations, condition-based          |
| **Do-While** | Exit               | 1              | Menu-driven programs, atleast one run needed |
