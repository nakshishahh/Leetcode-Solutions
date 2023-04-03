//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
            int k = sc.nextInt();
    		System.out.println (new Solution().substrCount (s, k));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    long substrCount (String S, int K) {
        
     return count(S,K) - count(S,K-1);
    }
    
    long count(String s, int k)
    {
        int [] arr = new int[26];
        int distinct=0;
        int st=0;
        int ed=0;
        long total=0;
        
        while(ed < s.length())
        {
            if(arr[s.charAt(ed)-'a']== 0)
                distinct++;
                
               arr[s.charAt(ed)-'a']++;
               
            while(distinct > k)
            {
            arr[s.charAt(st)-'a']--;
            
            if(arr[s.charAt(st)-'a']==0)
            distinct--;
            
            st++;
            }
            
            total+=ed-st+1;// includes all substrings that have atmost k ditinct characters
            
            ed++;
        }
        return total;

}
}
        // your code here
    