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

## 🧩 Project: Nested Classes in Java

This project demonstrates the **four main types of nested classes** in Java, each implemented with clear examples and clean console outputs.

### 🔹 Topics Covered
- **Inner Class (Non-Static)** → Demonstrates how inner classes can access outer class members.
- **Static Inner Class** → Shows how to access members without creating an outer class instance.
- **Local Inner Class** → Defines a class inside a method and accesses its local scope.
- **Anonymous Inner Class** → Implements an abstract method on the fly without naming the subclass.

### 🧠 Key Concepts
- Code organization and encapsulation with nested classes.
- Scope and access control between outer and inner classes.
- Static vs. non-static context understanding in Java.

### 🚀 How to Run
Simply execute the `Main.java` file.  
Each nested class example will display in the terminal with a clean and structured output format.

---

## 🧩 Project: Generic Structures (Nullable & Test)

This project demonstrates **Java Generics** with real-world examples.  
It includes reusable utility classes for handling different data types safely and efficiently.

---

# 📚 Project: BookSorter – Sorting Books Using Comparable & Comparator

This project demonstrates how to use **Java's Comparator interface** to sort objects in different ways.  
The application sorts a collection of books in **two different orders**:

- **Alphabetically (A → Z) by book name** using `OrderName` comparator
- **Ascending by page count** using `OrderPageNumber` comparator

---

## 📘 Class Overview

### 📖 `Book.java`
Represents a book with the following fields:

- `String name` – Book title
- `int pageNumber` – Number of pages
- `String authorName` – Author of the book
- `int date` – Publication year

This class provides standard getters and setters but does **not** implement `Comparable`,  
because custom sorting is handled externally by Comparator classes.

---

### 🔤 `OrderName.java`
A Comparator class that sorts books alphabetically by **name**.

```java
public class OrderName implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
```

---

### 📄 `OrderPageNumber.java`
A Comparator class that sorts books by **page count** (ascending order).

```java
public class OrderPageNumber implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getPageNumber() - o2.getPageNumber();
    }
}
```

---

## 🧪 Example Usage (`Main.java`)

Two `TreeSet` structures are created:  
one sorted by **name**, the other sorted by **page count**.

```java
Set<Book> books = new TreeSet<>(new OrderName());
Set<Book> books1 = new TreeSet<>(new OrderPageNumber());

books.add(new Book("To Kill a Mockingbird", 336, "Harper Lee", 1960));
books.add(new Book("Pride and Prejudice", 279, "Jane Austen", 1813));
books.add(new Book("Brave New World", 311, "Aldous Huxley", 1932));
books.add(new Book("Moby Dick", 635, "Herman Melville", 1851));
books.add(new Book("The Hobbit", 310, "J.R.R Tolkien", 1937));

books1.add(new Book("To Kill a Mockingbird", 336, "Harper Lee", 1960));
books1.add(new Book("Pride and Prejudice", 279, "Jane Austen", 1813));
books1.add(new Book("Brave New World", 311, "Aldous Huxley", 1932));
books1.add(new Book("Moby Dick", 635, "Herman Melville", 1851));
books1.add(new Book("The Hobbit", 310, "J.R.R Tolkien", 1937));
```

---

## 📊 Output Examples

### **Sorted by Name**
```
Brave New World
Moby Dick
Pride and Prejudice
The Hobbit
To Kill a Mockingbird
```

### **Sorted by Page Number**
```
Pride and Prejudice
The Hobbit
Brave New World
To Kill a Mockingbird
Moby Dick
```

---

## 🎯 What You Learn From This Project

- How to store custom objects inside a `TreeSet`
- How to write multiple sorting logics using `Comparator`
- How `TreeSet` automatically sorts elements based on provided comparator
- Good class design for data models like `Book`

---

## 🛠 Technologies Used

- **Language:** Java
- **Concepts:** Comparator, OOP, Collections Framework
- **Structures:** TreeSet, Custom Sorting

---



## 🚀 How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/kullaniciAdiniz/java102.git
