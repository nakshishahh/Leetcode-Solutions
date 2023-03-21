//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {

            int n;
            n = sc.nextInt();

            int k;
            k = sc.nextInt();

            int[] v = new int[n];
            for (int i = 0; i < n; i++) v[i] = sc.nextInt();

            Solution obj = new Solution();
            int res = obj.solve(n, k, v);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public static int solve(int n, int k, int[] stalls) {
    Arrays.sort(stalls);

    int left = 0;
    int right = stalls[n-1] - stalls[0];

    while (left <= right) {
        int mid = (left + right) / 2;
        if (countCows(stalls, mid) >= k) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    return right;
}

private static int countCows(int[] stalls, int distance) {
    int count = 1;
    int lastStall = stalls[0];
    for (int i = 1; i < stalls.length; i++) {
        if (stalls[i] - lastStall >= distance) {
            count++;
            lastStall = stalls[i];
        }
    }

    return count;
}
}

    