# Basics of Java ☕

This folder contains the foundational building blocks of Java programming. Here we will learn about how to store data, take user input, and control the flow of our program.

## 📂 Files Overview

- **`Variable.java`**: unique container examples.
- **`input.java`**: Using Scanner class.
- **`Sum.java`**: Basic arithmetic.
- **`IfElse.java`**: Conditional logic.
- **`Switch.java`**: Multiple choice logic.

---

## 📘 Tutorial: Core Concepts

### 1. Variables and Data Types

Variables are like containers (boxes) where we store data. In Java, because it is **Statically Typed**, we must decide what _kind_ of data goes into the box before we use it.

**Common Primitive Types:**

- `int`: For whole numbers (e.g., `10`, `-500`). _Size: 4 bytes_
- `double`: For decimal numbers (e.g., `3.14`, `19.99`). _Size: 8 bytes_
- `char`: For single characters (e.g., `'A'`, `'@'`). _Size: 2 bytes_
- `boolean`: For `true` or `false` values. _Size: 1 bit_

**Example:**

```java
int age = 25;
double price = 99.50;
char grade = 'A';
boolean isStudent = true;
```

### 2. Input (Scanner Class)

To make programs interactive, we need to take input from the user. We use the `Scanner` class provided by Java.

**Steps:**

1.  **Import**: `import java.util.Scanner;`
2.  **Create Object**: `Scanner sc = new Scanner(System.in);`
3.  **Read Data**:
    - `sc.nextInt()` -> Reads an integer.
    - `sc.next()` -> Reads a single word.
    - `sc.nextLine()` -> Reads the entire line/sentence.

### 3. Conditional Statements

Code doesn't always run in a straight line. Sometimes we need to make choices.

#### If-Else

Checks a condition. If it's true, do one thing; if false, do another.

```java
int age = 20;
if (age > 18) {
    System.out.println("Can vote");
} else {
    System.out.println("Too young");
}
```

#### Switch Statement

Used when you have one variable to compare against many specific values (cases). It's cleaner than many `else-if` blocks.

```java
int day = 3;
switch(day) {
    case 1: System.out.println("Mon"); break;
    case 2: System.out.println("Tue"); break;
    case 3: System.out.println("Wed"); break; // Prints this
    default: System.out.println("Invalid");
}
```

- **Note**: Always use `break` to stop the code from "falling through" to the next case!
