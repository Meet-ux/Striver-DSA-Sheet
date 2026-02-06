## 🟩 **1. Selection Sort**

### 🔹 **Logic:**

- Find the **smallest element** in the unsorted part of the array
    
- Swap it with the **first unsorted element**
    
- Repeat until the array is sorted
    

### 🧠 **Step Example:**

`Array: [23, 45, 12, 4, 65] → Smallest is 4 → swap with 23 → [4, 45, 12, 23, 65] → Next smallest 12 → swap with 45 → [4, 12, 45, 23, 65] → And so on...`

### 💻 **Code:**

`for (int i = 0; i < n - 1; i++) {     int min = i;     for (int j = i + 1; j < n; j++) {         if (arr[j] < arr[min])             min = j;     }     int temp = arr[i];     arr[i] = arr[min];     arr[min] = temp; }`

### ⏱️ **Time Complexity:**

|Case|Complexity|
|---|---|
|Best|O(n²)|
|Average|O(n²)|
|Worst|O(n²)|
|**Space Complexity:** O(1)||
|**Stable:** ❌ No||

---

## 🟦 **2. Bubble Sort**

### 🔹 **Logic:**

- Repeatedly **compare adjacent elements**
    
- **Swap them** if they are in the wrong order
    
- Largest element "bubbles up" to the end each pass
    

### 🧠 **Step Example:**

`Array: [5, 1, 4, 2] → Compare 5 & 1 → swap → [1, 5, 4, 2] → Compare 5 & 4 → swap → [1, 4, 5, 2] → Compare 5 & 2 → swap → [1, 4, 2, 5] → Next pass → [1, 2, 4, 5]`

### 💻 **Code:**

`for (int i = 0; i < n - 1; i++) {     for (int j = 0; j < n - i - 1; j++) {         if (arr[j] > arr[j + 1]) {             int temp = arr[j];             arr[j] = arr[j + 1];             arr[j + 1] = temp;         }     } }`

### ⏱️ **Time Complexity:**

|Case|Complexity|
|---|---|
|Best|O(n) _(when already sorted)_|
|Average|O(n²)|
|Worst|O(n²)|
|**Space Complexity:** O(1)||
|**Stable:** ✅ Yes||

---

## 🟨 **3. Insertion Sort**

### 🔹 **Logic:**

- Pick one element at a time (like sorting cards in hand)
    
- **Insert it into the correct position** in the already sorted part
    

### 🧠 **Step Example:**

`Array: [5, 3, 4, 1] → Start from 3 → place before 5 → [3, 5, 4, 1] → Take 4 → place before 5 → [3, 4, 5, 1] → Take 1 → place before 3 → [1, 3, 4, 5]`

### 💻 **Code:**

`for (int i = 1; i < n; i++) {     int key = arr[i];     int j = i - 1;     while (j >= 0 && arr[j] > key) {         arr[j + 1] = arr[j];         j--;     }     arr[j + 1] = key; }`

### ⏱️ **Time Complexity:**

|Case|Complexity|
|---|---|
|Best|O(n)|
|Average|O(n²)|
|Worst|O(n²)|
|**Space Complexity:** O(1)||
|**Stable:** ✅ Yes||

---

## ⚡ **Summary Table:**

| Algorithm      | Best Case | Average Case | Worst Case | Space | Stable | Logic                 |     |
| -------------- | --------- | ------------ | ---------- | ----- | ------ | --------------------- | --- |
| Selection Sort | O(n²)     | O(n²)        | O(n²)      | O(1)  | ❌ No   | Select min & swap     |     |
| Bubble Sort    | O(n)      | O(n²)        | O(n²)      | O(1)  | ✅ Yes  | Swap adjacent         |     |
| Insertion Sort | O(n)      | O(n²)        | O(n²)      | O(1)  | ✅ Yes  | Insert in sorted part |     |


## **1. What is Merge Sort?**

- Merge Sort is a **divide-and-conquer sorting algorithm**.
    
- It **divides** the array into two halves, **sorts them recursively**, and then **merges** the sorted halves.
    
- Works efficiently for **large arrays**.
    

---

## **2. Intuition / Logic (Easy Way)**

Think of it like **sorting a deck of cards**:

1. Split the deck into two halves.
    
2. Keep splitting until each pile has **one card** (single element = sorted).
    
3. Merge two piles by picking the **smaller card** from the top of each pile.
    
4. Repeat merging until you have one **sorted deck**.
    

---

## **3. Step-by-Step Example**

Array: `[38, 27, 43, 3, 9, 82, 10]`

**Step 1: Divide**

`Left: [38, 27, 43, 3]      Right: [9, 82, 10]`

**Step 2: Divide further**

`Left → [38,27] [43,3]   Right → [9,82] [10]`

**Step 3: Divide until single element**

`[38],[27],[43],[3],[9],[82],[10]`

**Step 4: Merge sorted halves**

`Merge [38] & [27] → [27,38]   
`Merge [43] & [3] → [3,43]   
`Merge [27,38] & [3,43] → [3,27,38,43]  
`Merge [9,82] & [10] → [9,10,82]   
`Final Merge → [3,9,10,27,38,43,82]`

✅ Sorted array achieved.

---

## **4. Merge Sort Algorithm (Pseudo-Code)**

In vs code

---

## **5. Time Complexity**

|Case|Complexity|
|---|---|
|Best|O(n log n)|
|Average|O(n log n)|
|Worst|O(n log n)|

- Reason: Each division is log n levels deep, and at each level we process all `n` elements while merging.
    

---

## **6. Space Complexity**

- **O(n)** → Extra arrays are used during merging.
    

---

### ✅ **Key Points**

- Merge Sort is **stable** (doesn’t change the order of equal elements).
    
- Works well for **large data** and **linked lists**.
    
- Slower for small arrays compared to simple sorts like Insertion Sort because of **extra space**.