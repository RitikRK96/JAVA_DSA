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

### 3. Cheat Sheet: Ultimate String Methods List 📜

Here are the **30+ most important methods** you need for Interviews and Development.

#### 🔍 Inspection & Access

| Method          | Description                                     | Example                   |
| :-------------- | :---------------------------------------------- | :------------------------ |
| `length()`      | Returns number of characters                    | `"Hello".length()` → `5`  |
| `charAt(int i)` | Returns char at index                           | `"ABC".charAt(1)` → `'B'` |
| `isEmpty()`     | Checks if length is 0                           | `"".isEmpty()` → `true`   |
| `isBlank()`     | Checks if empty or whitespace only (_Java 11+_) | `"  ".isBlank()` → `true` |

#### ⚖️ Comparison

| Method                          | Description                           | Example                                |
| :------------------------------ | :------------------------------------ | :------------------------------------- |
| `equals(Object o)`              | Compares **content** (case-sensitive) | `"Hi".equals("hi")` → `false`          |
| `equalsIgnoreCase(String s)`    | Compares **content** (ignores case)   | `"Hi".equalsIgnoreCase("hi")` → `true` |
| `compareTo(String s)`           | Lexicographical comparison            | `"A".compareTo("B")` → `-1`            |
| `compareToIgnoreCase(String s)` | Lexicographical (ignores case)        | `"a".compareToIgnoreCase("A")` → `0`   |
| `startsWith(String s)`          | Checks if starts with prefix          | `"Hello".startsWith("He")` → `true`    |
| `endsWith(String s)`            | Checks if ends with suffix            | `"Hello".endsWith("lo")` → `true`      |
| `contains(CharSequence s)`      | Checks if sequence is present         | `"Java".contains("av")` → `true`       |

#### 🔎 Searching

| Method                        | Description                      | Example                          |
| :---------------------------- | :------------------------------- | :------------------------------- |
| `indexOf(String s)`           | Returns first index of substring | `"Hello".indexOf("l")` → `2`     |
| `lastIndexOf(String s)`       | Returns last index of substring  | `"Hello".lastIndexOf("l")` → `3` |
| `indexOf(String s, int from)` | Search starting from index       | `"Hello".indexOf("l", 3)` → `3`  |

#### ✏️ Modification (Returns New String)

| Method                                    | Description                         | Example                                               |
| :---------------------------------------- | :---------------------------------- | :---------------------------------------------------- |
| `substring(int begin)`                    | Returns suffix from index           | `"Hello".substring(2)` → `"llo"`                      |
| `substring(int begin, int end)`           | Returns substring `[begin, end)`    | `"Hello".substring(0, 2)` → `"He"`                    |
| `concat(String s)`                        | Appends to end (Use `+` instead)    | `"Hi".concat("!")` → `"Hi!"`                          |
| `replace(char old, char new)`             | Replaces all char occurrences       | `"aba".replace('a', 'o')` → `"obo"`                   |
| `replace(CharSequence t, CharSequence r)` | Replaces all substring occurrences  | `"Hi World".replace("Hi", "Hello")` → `"Hello World"` |
| `replaceAll(String regex, String r)`      | Replaces via Regex                  | `"a1b2".replaceAll("\\d", "#")` → `"a#b#"`            |
| `toLowerCase()`                           | Converts to lowercase               | `"HI".toLowerCase()` → `"hi"`                         |
| `toUpperCase()`                           | Converts to uppercase               | `"hi".toUpperCase()` → `"HI"`                         |
| `trim()`                                  | Removes leading/trailing spaces     | `"  Hi  ".trim()` → `"Hi"`                            |
| `strip()`                                 | Unicode-aware trim (_Java 11+_)     | `"\u2005Hi ".strip()` → `"Hi"`                        |
| `repeat(int count)`                       | Repeats string n times (_Java 11+_) | `"Hi".repeat(2)` → `"HiHi"`                           |

#### 🔄 Conversion

| Method                  | Description                    | Example                            |
| :---------------------- | :----------------------------- | :--------------------------------- |
| `toCharArray()`         | Converts to char array         | `"Hi".toCharArray()` → `['H','i']` |
| `split(String regex)`   | Splits into array by delimiter | `"A,B".split(",")` → `["A", "B"]`  |
| `String.valueOf(int i)` | Static: Converts int to String | `String.valueOf(10)` → `"10"`      |
| `getBytes()`            | Encodes string to byte array   | `"Hi".getBytes()` → `[72, 105]`    |
