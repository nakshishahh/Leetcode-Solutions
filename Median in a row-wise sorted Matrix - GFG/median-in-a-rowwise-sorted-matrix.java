//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S[] = read.readLine().split(" ");
            int R = Integer.parseInt(S[0]);
            int C = Integer.parseInt(S[1]);
            int matrix[][] = new int[R][C];
            int c = 0;
            for(int i = 0; i < R; i++){
                String line[]=read.readLine().trim().split(" ");
                for(int j = 0; j < C; j++){
                    matrix[i][j] = Integer.parseInt(line[j]);
                }
            }
            Solution ob = new Solution();
            int ans = ob.median(matrix, R, C);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int median(int matrix[][], int R, int C) {
        // code here        
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Find the min and max values in the matrix
        int min = matrix[0][0];
        int max = matrix[rows - 1][cols - 1];
        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] < min) {
                min = matrix[i][0];
            }
            if (matrix[i][cols - 1] > max) {
                max = matrix[i][cols - 1];
            }
        }

        // Binary search for the median value
        int target = (rows * cols + 1) / 2;
        while (min < max) {
            int mid = (min + max) / 2;
            int count = 0;
            for (int i = 0; i < rows; i++) {
                count += countSmaller(matrix[i], mid);
            }
            if (count < target) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }

        return min;
    }

    private static int countSmaller(int[] row, int target) {
        int count = 0;
        int left = 0, right = row.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (row[mid] <= target) {
                left = mid + 1;
                count = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return count;
    }
}

    