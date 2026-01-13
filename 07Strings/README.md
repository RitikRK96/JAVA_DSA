# Strings in Java 🧵

Strings are one of the most widely used classes in Java. Unlike other primitives, `String` is a **Class**, meaning it's an object.

## 📂 Files Overview

- **`StringBasics.java`**:
  - **String Pool vs Heap**: Difference between `String s = "A"` and `new String("A")`.
  - **Immutability**: Why String values cannot be changed once created.
  - **Input**: `next()` vs `nextLine()`.
- **`StringFunctions.java`**:
  - **Common Methods**: `length()`, `charAt()`, `substring()`.
  - **Interview Methods**: `contains()`, `replace()`, `trim()`, `split()`.
- **`StringBuilderDemo.java`**:
  - **Mutability**: Modifying strings without creating new objects (Efficient).
  - **Methods**: `append()`, `insert()`, `reverse()`.
- **`Reverse.java`**:
  - **Two Pointer algo**: Efficient $O(n)$ way to reverse.
  - **Concatenation**: Less efficient $O(n^2)$ way.

---

## 📘 Tutorial: Deep Dive

### 1. String vs StringBuilder

| Feature          | String                          | StringBuilder                             |
| :--------------- | :------------------------------ | :---------------------------------------- |
| **Mutability**   | **Immutable** (Unchangeable)    | **Mutable** (Changeable)                  |
| **Storage**      | String Constant Pool (mostly)   | Heap Memory                               |
| **Efficiency**   | Slow for frequent modifications | Fast & Efficient                          |
| **Thread Safe?** | Yes                             | No (Use `StringBuffer` for thread safety) |

### 2. Memory Map (Visual)

```java
String s1 = "Tony";
String s2 = "Tony";
```

**In Memory**:

- "Tony" is created **once** in the String Pool.
- `s1` and `s2` both point to the _same_ address.
- `s1 == s2` is `true`.

```java
String s3 = new String("Tony");
```

- new "Tony" created in Heap (outside pool).
- `s1 == s3` is `false`.

### 3. Cheat Sheet: Common Methods

| Method            | Description                              | Example                             |
| :---------------- | :--------------------------------------- | :---------------------------------- |
| `length()`        | Returns count of chars                   | `"Hi".length()` -> `2`              |
| `charAt(i)`       | Returns char at index                    | `"Hi".charAt(0)` -> `'H'`           |
| `substring(i, j)` | Returns part of string from `i` to `j-1` | `"Hello".substring(0,2)` -> `"He"`  |
| `contains(s)`     | Checks if `s` is present                 | `"Hello".contains("ell")` -> `true` |
| `equals(s)`       | Compares **content**                     | `s1.equals(s2)`                     |
| `trim()`          | Removes start/end spaces                 | `"  Hi  ".trim()` -> `"Hi"`         |
