//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{
    //Function to find minimum number of pages.
    public static int findPages(int[]A,int N,int M)
    {
        int start = Integer.MIN_VALUE;
        int end = 0;
        int ans = -1;
        for(int i = 0;i<N;i++){
            start = Math.max(start,A[i]);
            end += A[i];
            
        }
        if(M>N){
            return -1;
        }
        if(N==M){
            return start;
        }
        while(start<=end){
            int mid = start + (end-start)/2;
            if(find(A,M,mid)==true){
                ans = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        
        return ans;
        //Your code here
    }
    static boolean find(int[] arr , int m , int mid){
        int count  =1;
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>mid){
                return false;
            }
            if(sum + arr[i]>mid){
                sum = arr[i];
                count++;

            }else{
                sum = sum + arr[i];
            }
            
        }
        return count <= m;
    }
}