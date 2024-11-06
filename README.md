# Data Structures and Algorithms (DSA) Notes

This repository contains solutions to common DSA problems and notes for better understanding. Below are solutions to several key problems.

---

## 1. Minimum and Maximum Element in an Array

**Problem:** Find the minimum and maximum element in an array.

**Solution:**
- Use `Integer.MAX_VALUE` for the initial value of minimum.
- Use `Integer.MIN_VALUE` for the initial value of maximum.

```java
class Solution {
    public int[] findMinMax(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        
        return new int[] {min, max};
    }
}
