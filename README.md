# Sort

A Java project exploring sorting algorithms, shuffling, and object-oriented design through inheritance and interfaces.

---

## Project Structure

```
src/
  IntegerManager.java   – Abstract base class for integer lists
  NameManager.java      – Abstract base class for name lists
  PrintPretty.java      – Interface for formatted output
  Activity1.java        – Extends IntegerManager + implements PrintPretty
  Activity2.java        – Extends NameManager + implements PrintPretty
```

---

## Key Concepts

### Inheritance

`IntegerManager` and `NameManager` are **abstract classes** — they define *what* a class must be able to do, but leave the *how* up to you. When your concrete class `extends` one of them, it inherits the protected data field and is required to provide a real implementation for every `abstract` method.

```
IntegerManager          NameManager
      |                      |
  Activity1              Activity2
```

Because `Activity1` extends `IntegerManager`, it automatically has access to `nums`. It then fills in all the sorting, shuffling, and utility methods declared abstract in the parent.

The same relationship holds for `Activity2` and `NameManager` — it inherits `names` and must implement every abstract method.

### The `PrintPretty` Interface

`PrintPretty` is an **interface** — a contract that says: *"any class that implements me must provide a `printPretty()` method."*

Both `Activity1` and `Activity2` implement `PrintPretty` in addition to extending their respective abstract classes. This is how Java lets a class pick up behavior from multiple sources: one parent class via `extends`, plus any number of interfaces via `implements`.

```java
public class Activity1 extends IntegerManager implements PrintPretty { ... }
public class Activity2 extends NameManager    implements PrintPretty { ... }
```

`printPretty()` should display your list in a readable, well-formatted way — the exact format is up to you.

---

## What You Need to Implement

### Activity1 — Integer Sorting

| Method | Description |
|---|---|
| `buildList()` | Prompt the user to enter integers; stop on a sentinel value |
| `shuffle()` | Randomly rearrange the elements in `nums` |
| `insertionSort()` | Sort `nums` using the insertion sort algorithm |
| `selectionSort()` | Sort `nums` using the selection sort algorithm |
| `mergeSort()` | Sort `nums` using the merge sort algorithm |
| `pickRandom()` | Return a random element from `nums` |
| `printPretty()` | Display `nums` in a formatted, readable way |

### Activity2 — Name Sorting

| Method | Description |
|---|---|
| `buildList()` | Prompt the user to enter names; stop when a blank line is submitted |
| `shuffle()` | Randomly rearrange the elements in `names` |
| `insertionSort()` | Sort `names` alphabetically using insertion sort |
| `selectionSort()` | Sort `names` alphabetically using selection sort |
| `mergeSort()` | Sort `names` alphabetically using merge sort |
| `pickRandom()` | Return a random name from `names` |
| `printPretty()` | Display `names` in a formatted, readable way |

---

## How the Algorithms Work (Conceptually)

### Shuffling

The goal is to produce a random ordering of your list. Think about how you might visit each position in the list and swap it with another position chosen at random. Every element should have an equal chance of ending up anywhere.

### Insertion Sort

Imagine sorting a hand of playing cards. You pick up one card at a time and slide it left until it's in the right spot relative to the cards you've already sorted. The left portion of the list is always sorted; the right portion is still waiting to be processed.

### Selection Sort

Scan the entire unsorted portion of the list to find the smallest (or largest) element, then place it at the front of that portion. Repeat. Each pass "selects" the next element that belongs in its final position.

### Merge Sort

Divide the list in half, sort each half, then merge the two sorted halves back together. Merging two already-sorted lists is straightforward: repeatedly pick the smaller of the two front elements. The power comes from doing this recursively — keep splitting until each piece is a single element (which is trivially sorted), then merge your way back up.

---

## Getting Started

1. Implement all abstract methods in `Activity1` and `Activity2`.
2. Run `Activity1.main()` to test your integer implementation.
3. Run `Activity2.main()` to test your name implementation.
