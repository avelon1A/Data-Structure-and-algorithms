/**
 * @brief Function to calculate the minimum possible total cost for the frog to reach the last stair.
 *
 * Given an array `heights[]` of size `N`, where `heights[i]` represents the height of the ith stair (0 <= i < N),
 * a frog starts at the 0-th stair and needs to reach the (N-1)-th stair.
 * The frog can either jump to the next stair (i+1) or skip a stair and jump to the next of next stair (i+2).
 * The cost of jumping from stair `i` to stair `j` is defined as the absolute difference between `heights[i]` and `heights[j]`.
 * The goal is to find the minimum possible total cost incurred for the frog to reach the last stair.
 *
 * @param n The number of stairs (size of the heights array).
 * @param heights An array of integers representing the height of each stair.
 * @return int The minimum total cost for the frog to reach the last stair.
 *
 * @example
 * Input: n = 4, heights = {20, 30, 40, 20}
 * Output: 20
 * Explanation:
 * - 0 to 1: cost = |30 - 20| = 10
 * - 1 to 3: cost = |20 - 30| = 10
 * - Total cost = 10 + 10 = 20
 *
 * @example
 * Input: n = 5, heights = {30, 20, 50, 10, 40}
 * Output: 30
 * Explanation:
 * - 0 to 2: cost = |30 - 50| = 20
 * - 2 to 3: cost = |50 - 40| = 10
 * - Total cost = 20 + 10 = 30
 */
int frogMinCost(int n, int heights[])
{
    // Logic for calculating minimum cost goes here
}


