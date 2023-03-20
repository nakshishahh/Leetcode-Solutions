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
        if(M>N){
            return -1;
        }
        
        //Your code here
        int max = A[0];
        int sum = 0;
        int ans =-1;
        for(int i = 0;i<A.length;i++){
            sum = sum + A[i];
            if(A[i]>max){
                max = A[i];
            }
        }
        if(M==N){
            return max;
        }
        int l = max;
        int h = sum;
        while(l<=h){
            int mid = l + (h-l)/2;
            if(find(A,N,M,mid)==true){
                ans = mid;
                h=mid-1;
            }else{
                l = mid + 1;
            }
            
        }
        return ans;
    }
     static boolean find(int[] arr, int N , int m , int mid){
        int sum = 0;
        int no = 1;
        for(int i = 0;i<N;i++){
            sum += arr[i];
            if(sum>mid){
                sum=arr[i];
                no++;
            }
        }
        return no<=m;
    }
}