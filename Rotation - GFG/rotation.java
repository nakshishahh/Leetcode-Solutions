//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int ans = new Solution().findKRotation(a, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int findKRotation(int arr[], int n) {
        int peak = peak(arr);
        peak = peak + 1;
        return peak;
    }
    int peak(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if( mid < end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid > start && nums[mid]<nums[mid-1]){
                return mid - 1;
            }
            if(nums[mid]>nums[start]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        
        return -1;
        
        // code here
    
}
}