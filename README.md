### SCHOOL MANAGEMENT SYSTEM PROTOTYPE.

Main concepts are from Data Structures. The Programming Language used : JAVA


**Course:** Data Structures and Algorithms  
**Language:** Java  
## 🚀 Key Features & DSA Implementation

This system is built on 5 distinct modules, each utilizing a specific data structure:

### 1. Student Registry 🗂️
* **Data Structure:** `HashMap` (Hash Table)
* **Application:** Stores student records using unique IDs as keys.
* **Why?** Provides **$O(1)$ (Constant Time)** access for lookups. In a university with 10,000+ students, searching a List ($O(n)$) would be too slow.

### 2. Course Scheduling ⏳
* **Data Structure:** `LinkedList` (Queue Implementation)
* **Application:** Manages course enrollment waitlists.
* **Why?** Enforces a **First-Come-First-Served (FIFO)** policy.This ensures ethical fairness in course allocation, preventing bias.

### 3. Fee Tracking 💰
* **Data Structure:** `TreeMap` (Binary Search Tree / Red-Black Tree)
* **Application:** Records fee payments and generates clearance reports.
* **Why?** Maintains data in **Sorted Order** naturally. Unlike a Hash Table, a BST allows us to print a sorted report of who paid the least/most in $O(n)$ time after $O(\log n)$ insertions.

### 4. Library Management 📚
* **Data Structure:** `Stack`
* **Application:** Tracks the history of returned books.
* **Why?** Uses **Last-In-First-Out (LIFO)** logic. The most recently returned book is at the "top" of the pile, making it easy to undo transactions or view recent history.

### 5. Performance Analytics 🔗
* **Data Structure:** Adjacency List (Graph)
* **Application:** Maps relationships between Students and Subjects.
* **Why?** Efficiently represents **Many-to-Many relationships**. It allows us to traverse connections (e.g., "Which students are taking CS101?") without wasting memory on empty matrix cells.

---

## 📂 Project Structure

The project follows a modular design pattern:

```text
src/
├── Student.java                 # Data Model
├── StudentRegistry.java         # Module: Hash Table Logic
├── CourseScheduler.java         # Module: Queue Logic
├── FeeTracker.java              # Module: BST Logic
├── LibrarySystem.java           # Module: Stack Logic
├── PerformanceAnalytics.java    # Module: Graph Logic
└── SchoolManagementSystem.java  # Main Controller (Entry Point)
