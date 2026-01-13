# Loops (Iterative Statements) 🔄

Loops allow us to execute a block of code multiple times without writing it over and over again. This folder explores the three main types of loops in Java.

## 📂 Files Overview

- **`For.java`**: Standard for loop examples.
- **`While.java`**: While loop usage.
- **`DoWhile.java`**: Do-While loop example.

---

## 📘 Tutorial: Mastering Loops

### 1. For Loop

The **For Loop** is the most commonly used loop. It is best used when you know **exactly how many times** you want to repeat something.

**Syntax:**

```java
for (initialization; condition; update) {
    // Body
}
```

- **Initialization**: Starting point (e.g., `int i = 0`). Executed once.
- **Condition**: Checked before every iteration. If true, loop runs. If false, loop stops.
- **Update**: Happens after the body executes (e.g., `i++`).

**Example**:

```java
for(int i = 0; i < 5; i++) {
    System.out.println("Hello " + i);
}
```

### 2. While Loop

The **While Loop** is used when we don't know the exact number of iterations, but we know **when to stop** (based on a condition). It is an **Entry Controlled** loop.

**Syntax:**

```java
while (condition) {
    // Body
    // Update step (crucial to avoid infinite loops!)
}
```

**Example**:

```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++; // Don't forget this!
}
```

### 3. Do-While Loop

The **Do-While Loop** is unique because it guarantees the code runs **at least once**, regardless of the condition. It is an **Exit Controlled** loop (checks condition at the end).

**Syntax:**

```java
do {
    // Body executes first
} while (condition);
```

**Example**:

```java
int i = 10;
do {
    System.out.println("This prints even though 10 is not < 5");
} while (i < 5);
```

### Summary Comparison

| Feature             | For Loop             | While Loop         | Do-While Loop          |
| :------------------ | :------------------- | :----------------- | :--------------------- |
| **Use When**        | Iterations are known | Iterations unknown | Must run at least once |
| **Condition Check** | Start (Entry)        | Start (Entry)      | End (Exit)             |
| **Minimum Runs**    | 0                    | 0                  | 1                      |
