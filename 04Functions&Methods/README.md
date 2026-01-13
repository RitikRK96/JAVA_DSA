# Functions and Methods in Java

## Introduction

In programming, functions are blocks of code that perform a specific task. They help in reducing code redundancy and improving modularity. In Java, functions are known as **Methods** because they are always associated with a class or an object.

## What is a Function?

A function is a block of code dealing with a specific task, which executes only when it is called. You can pass data, known as parameters, into a function. A function can return data as a result.

### Syntax

```java
returnType functionName(type parameter1, type parameter2, ...) {
    // code to be executed
    return value;
}
```

- **returnType**: The data type of the value the function returns (e.g., `int`, `String`, `void` if nothing is returned).
- **functionName**: The name of the function (camelCase is the convention in Java).
- **Parameters**: Inputs to the function.
- **Body**: The code statements that define what the function does.

## Functions vs Methods

While the terms are often used interchangeably, there is a subtle difference in the context of Object-Oriented Programming (OOP).

| Feature          | Function                                                                       | Method                                                                       |
| :--------------- | :----------------------------------------------------------------------------- | :--------------------------------------------------------------------------- |
| **Definition**   | A block of code that performs a specific task and can be called independently. | A function that is associated with an object or a class.                     |
| **Independence** | Can exist independently (e.g., in C, C++, Python).                             | Cannot exist independently; must be within a class in Java.                  |
| **Data Access**  | Does not implicitly handle data associated with an object.                     | Can manipulate the data (instance variables) of the class it belongs to.     |
| **Call Style**   | Called by its name: `functionName()`.                                          | Called on an object or class: `object.methodName()` or `Class.methodName()`. |

**Note**: Since Java is strictly an Object-Oriented language, we technically only have **Methods**. However, static methods (like `main`) behave somewhat like traditional functions because they don't belong to a specific instance.

## Types of Methods in Java

1.  **Pre-defined (Standard Library) Methods**:
    These are built-in methods available in Java libraries.

    - Examples: `System.out.println()`, `Math.sqrt()`, `string.length()`.

2.  **User-defined Methods**:
    These are methods created by the user (programmer) to perform specific tasks.

## Method Components

### 1. Header

The first line of the method definition.
Example: `public static int add(int a, int b)`

- **Access Modifier**: Defines the access type (e.g., `public`, `private`).
- **Static keyword**: If present, the method belongs to the class, otherwise to the instance.
- **Return Type**: Data type of the returned value.
- **Method Name**: Name of the method.
- **Parameter List**: List of input parameters.

### 2. Body

The code enclosed in `{ }` braces.

## Example Code

```java
public class Main {
    // User-defined method
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Calling the method
        int sum = add(5, 10);
        System.out.println("Sum: " + sum);
    }
}
```

## Memory Management (Stack)

- Methods are executed in the **Stack** memory.
- When a method is called, a frame is pushed onto the stack containing its local variables and arguments.
- When the method returns, its frame is popped (removed) from the stack.

## Method Overloading

Multiple methods can have the same name but different parameters (different type, number, or order).

```java
// Method 1
void print(int a) { ... }

// Method 2 (Overloaded)
void print(String b) { ... }
```

## Conclusion

Methods are the building blocks of Java applications. Understanding how to define, call, and overload methods is crucial for writing clean, reusable, and efficient code.
