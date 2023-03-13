//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Solution().inversionCount(arr, n));
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java


    class Solution {
    // arr[]: Input Array
    // N : Size of the Array arr[]
    // Function to count inversions in the array.
    static long inversionCount(long arr[], long N) {
        long[] temp = new long[arr.length];
        long low = 0;
        long high = N - 1;
        return mergeSort(arr, temp, low, high);
    }

    static long mergeSort(long[] arr, long[] temp, long left, long right) {
        long count = 0;
        if (right > left) {
            long mid = (right + left) / 2;
            count += mergeSort(arr, temp, left, mid);
            count += mergeSort(arr, temp, mid + 1, right);
            count += merge(arr, temp, left, mid + 1, right);
        }
        return count;
    }

    static long merge(long arr[], long temp[], long left, long mid, long right) {
        int i = (int) left, j = (int) mid, k = (int) left;
        long count = 0;
        while (i < mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                count += mid - i;
            }
        }
        while (i < mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        for (int index = (int) left; index <= right; index++) {
            arr[index] = temp[index];
        }
        return count;
    }
}

