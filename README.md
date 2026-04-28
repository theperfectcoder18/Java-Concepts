# Java-Concepts

A collection of Java programs covering core Object-Oriented Programming (OOP) concepts.

## 📌 Programs Included

### 1. Default Constructor (StudentConst.java)
Demonstrates how a default constructor works in Java.
- Creates a `StudentConst` class with instance variables `sno` and `sname`
- Object is created using the default constructor
- Calls the `talk()` method to display default values

## 🚀 How to Run

1. Make sure Java is installed
2. Compile the file
3. Run the program

## 🧠 Concepts Covered
- Class and Object
- Instance Variables
- Default Constructor
- Methods in Java

## 👤 Author
Kumar Ayush — BCA CSE Student


### 2. User Defined Values — `Employee.java`
Demonstrates how to assign user defined values to instance variables.
- Uses `accept()` method to assign values to `eno` and `ename`
- Uses `show()` method to display employee details




----------------------------------------------------------------------------





# 🏦 Bank Application — Data Hiding in Java

A beginner-friendly Java project demonstrating the **Data Hiding** concept of Object-Oriented Programming (OOP) using a simple Bank Account simulation.

---

## 📌 What is Data Hiding?

**Data Hiding** is an OOP principle where the internal data (fields) of a class are kept **private** and can only be accessed or modified through **public methods** (getters/setters). This protects data from unauthorized or invalid access.

> In this project, the `balance` field is **private** — it cannot be directly accessed or modified from outside the `Customer` class.

---

## 📁 Project Structure

```
Concept/
└── src/
    └── data_hiding/
        ├── Customer.java         # Core class with private balance field
        ├── Bankapplication.java  # Main class to run the program
        └── App.java
```

---

## 🧾 Classes Overview

### 🔒 `Customer.java`
- Contains a **private** `balance` field (default: 1000)
- `deposit(int amount)` — Adds money; rejects negative/zero amounts (prints "You are a Hakcer")
- `withdraw(int withdraw)` — Deducts money from balance

### 🚀 `Bankapplication.java`
- Entry point of the program
- Creates a `Customer` object and calls `deposit()` with `-3000` to demonstrate **validation via data hiding**


## 💡 Sample Output

```
You are a Hakcer
```
> When a negative deposit amount is passed, the program detects it and blocks the transaction — showcasing data protection in action.

---
🛡️ Key OOP Concept Demonstrated

| Concept | How it's used |
|---|---|
| **Data Hiding** | `balance` is `private` — not accessible directly |
| **Encapsulation** | `deposit()` and `withdraw()` control access to balance |
| **Validation** | Negative deposits are rejected inside the method |

