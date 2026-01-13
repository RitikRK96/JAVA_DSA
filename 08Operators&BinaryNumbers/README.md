# Operators & Binary Numbers 🧮

This module covers the core building blocks of logic (Operators) and the language of computers (Binary Numbers).

## 📂 Files Overview

- **`Operators.java`**: Arithmetic, Relational, Logical, and Assignment operators.
- **`BinaryToDecimal.java`**: Converting Binary (`101`) to Decimal (`5`).
- **`DecimalToBinary.java`**: Converting Decimal (`5`) to Binary (`101`).

---

## 📘 Tutorial: Operators

### 1. Types of Operators

| Type           | Symbols           | Description                              |
| :------------- | :---------------- | :--------------------------------------- |
| **Arithmetic** | `+ - * / %`       | Math operations. `%` gives remainder.    |
| **Relational** | `== != > < >= <=` | Compares values. Returns `true`/`false`. |
| **Logical**    | `&&` `\|\|` `!`   | Combines boolean logic (AND, OR, NOT).   |
| **Assignment** | `= += -=`         | Assigns values. `a += 5` is `a = a + 5`. |
| **Unary**      | `++ --`           | Increment/Decrement by 1.                |

### 2. Pre-Increment vs Post-Increment

- **`a++` (Post)**: Use value first, then increment.
- **`++a` (Pre)**: Increment first, then use value.

---

## 💻 Bitwise Operators (Binary Logic)

Operate directly on bits (0s and 1s). Very fast!

| Operator | Name            | Logic                             | Example ($A=5: 0101, B=6: 0110$) |
| :------- | :-------------- | :-------------------------------- | :------------------------------- |
| `&`      | **AND**         | `1` if both bits are 1            | `0101 & 0110` -> `0100` (4)      |
| `\|`     | **OR**          | `1` if at least one bit is 1      | `0101 \| 0110` -> `0111` (7)     |
| `^`      | **XOR**         | `1` if bits are different         | `0101 ^ 0110` -> `0011` (3)      |
| `~`      | **NOT**         | Inverts all bits                  | `~0101` -> `1010` (approx -6)    |
| `<<`     | **Left Shift**  | Shifts bits left ($a \times 2^b$) | `5 << 2` -> `010100` (20)        |
| `>>`     | **Right Shift** | Shifts bits right ($a / 2^b$)     | `6 >> 1` -> `0011` (3)           |

---

## 🔢 Binary Number System

Computers understand only 0s and 1s.

- **Base**: 2 (Digits: 0, 1)
- **Decimal Base**: 10 (Digits: 0-9)

### Conversion: Binary to Decimal

Sum of (Digit $\times$ Position Power of 2).

> Example: `101` > $= (1 \times 2^2) + (0 \times 2^1) + (1 \times 2^0)$ > $= 4 + 0 + 1$ > $= 5$

### Conversion: Decimal to Binary

Repeatedly divide by 2 and take the remainder (Reverse order).

> Example: `5` > $5 \% 2 = 1$ (Rem) -> 1
> $2 \% 2 = 0$ (Rem) -> 0
> $1 \% 2 = 1$ (Rem) -> 1
> Reverse: `101`
