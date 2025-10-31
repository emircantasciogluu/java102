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

# Project02OOPRelationships

This project demonstrates the **core relationships** in Object-Oriented Programming (OOP):  
**Dependency**, **Composition**, and the foundation for **Inheritance**.

These concepts are represented through a simple academic system with `Student`, `Instructor`, and `Course` classes.

---

## 📘 Classes Overview

### 👩‍🎓 `Student.java`
Represents a student with:
- `name`, `surname`, `idNo`, `address`, and `note` fields.
- Encapsulation through getters and setters.
- Validation in `setNote()` to ensure the grade is between **0–100**.

---

### 👨‍🏫 `Instructor.java`
Represents an instructor with:
- `name`, `surname`, and `department`.
- Standard getter and setter methods for encapsulation.

---

### 📚 `Course.java`
- Demonstrates **Composition** → Each `Course` *has an* `Instructor`.
- Demonstrates **Dependency** → The method `calcAverage(Student[] students)` depends on `Student` objects to function.
- Contains:
    - `calcAverage()` → Calculates average grade of enrolled students.
    - Accessor methods for both course and instructor details.

---

### ⚙️ `Main.java`
- Creates and connects `Student`, `Instructor`, and `Course` objects.
- Prints instructor’s department.
- Optionally (commented line) shows how to calculate students’ average grades using dependency logic.

---

# University OOP – Abstraction & Inheritance Demo

This mini Java project models a university organization based on a UML diagram.  
It demonstrates **Abstraction**, **Inheritance**, and a bit of **Polymorphism**.

### Class Hierarchy
- `Employee` (abstract)
    - `Academician`
        - `Lecturer` (senate meeting, exam)
        - `Assistant` (quiz)
        - `LabAssistant` (enter lab, teach lab)
    - `Officer`
        - `InformationTechnology` (setup network)
        - `SecurityOfficer` (stand watch)

---

# 🏝️ Adventure Game (Java)

A text-based adventure game built entirely with **Java**, where players explore mysterious locations, fight dangerous enemies, and collect rewards to survive on a dark and foggy island.

---

## 🎮 Features

- 🌍 **Exploration System** — Travel between multiple areas like Safe House, Cave, Forest, and River.
- ⚔️ **Combat Mechanics** — Engage in turn-based battles against Zombies, Vampires, and Bears.
- 🧍 **Player Customization** — Choose your character class: Samurai, Archer, or Knight.
- 🛒 **Tool Store** — Purchase weapons and armors to boost your attack and defense.
- 💾 **Inventory System** — Keep track of your items, coins, and equipped gear.
- 🧱 **Clean UI** — Fully English terminal interface with structured layouts and icons.

---

## 🧠 How to Play

1. Run the `Game` class to start the adventure.
2. Enter your player name.
3. Choose your character (Samurai, Archer, or Knight).
4. Explore areas and decide whether to **fight** or **retreat**.
5. Collect rewards, visit the Tool Store to upgrade, and survive as long as you can!

---

## ⚙️ Technologies Used

- **Language:** Java
- **IDE:** IntelliJ IDEA
- **Concepts:** Object-Oriented Programming (OOP), Inheritance, Polymorphism, Abstraction
- **Structure:** Clean modular classes for Player, Location, Obstacle, Weapon, and more.

---
## 🚀 How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/kullaniciAdiniz/java102.git
