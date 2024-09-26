#include <bits/stdc++.h>
using namespace std;

int f(int n, vector<int> &dp)
{
    if (n <= 1)
        return n;
    dp[0] = 0;
    dp[1] = 1;
    for (int i = 2; i <= n; i++)
    {

        dp[i] = dp[i - 1] + dp[i - 2];
    }
    return dp[n];
}

int main()
{
    int n;
    cin >> n;

    vector<int> dp(n + 1, -1);
    cout << "dynamic programing tabulation fibonachi " << f(n, dp);
}