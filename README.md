# Data Structures and Algorithms (DSA) Notes

This repository contains solutions to common DSA problems and notes for better understanding. The purpose of this document is to provide solutions to frequently asked DSA problems along with different techniques used in their solutions. 

Below are solutions to several key problems that are commonly asked in technical interviews and competitive programming.

---

## Table of Contents

1. [Minimum and Maximum Element in an Array](#1-minimum-and-maximum-element-in-an-array)
2. [Reverse the Array](#2-reverse-the-array)
3. [Maximum Subarray (Kadane's Algorithm)](#3-maximum-subarray-kadane's-algorithm)
4. [Duplicate in Array](#4-duplicate-in-array)
5. [Chocolate Distribution Problem](#5-chocolate-distribution-problem)
6. [Find the Missing Number in an Array](#6-find-the-missing-number-in-an-array)
7. [Move Zeroes to the End of the Array](#7-move-zeroes-to-the-end-of-the-array)
8. [Find Pair with Given Sum in Array](#8-find-pair-with-given-sum-in-array)
9. [Find the Intersection of Two Arrays](#9-find-the-intersection-of-two-arrays)

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
