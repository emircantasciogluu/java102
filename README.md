# Java102 - Learning Repository

This repository is a continuation of my **Java learning journey**, building upon the foundations of [Java101](https://github.com/kullaniciAdiniz/java101).  
Here, I explore **advanced concepts** such as:

- Object-Oriented Programming (OOP) in depth
- Collections Framework
- Algorithms and problem solving
- More complex, real-world inspired projects

## 📂 Structure
Each project is organized under its own package with descriptive names (e.g., `Project01XYZ`, `Project02ABC`).

# Project01Encapsulation

This project demonstrates the **Encapsulation** principle in Java — one of the four main pillars of Object-Oriented Programming (OOP).

Encapsulation means **hiding internal data** and allowing access only through controlled methods (getters and setters).  
It helps maintain data integrity and prevents external code from modifying object state directly.

---

## 📘 Classes Overview

### 🧱 `Book.java`
- **Private Fields:**
    - `String name`
    - `int pageNumber`
- **Constructor:**
    - Initializes the book with given name and page count.
    - If the `pageNumber` is negative, it automatically resets to `0`.
- **Getter & Setter Methods:**
    - `getName()` → Returns the book name.
    - `setName(String name)` → Updates the book name.
    - `getPageNumber()` → Returns the page number.
    - `setPageNumber(int pageNumber)` → Ensures page number cannot be negative.

---

### ⚙️ `Main.java`
- Creates a `Book` object and tests the getter/setter methods.
- Demonstrates validation behavior by attempting to set a negative page number.

---
## 🚀 How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/kullaniciAdiniz/java102.git
