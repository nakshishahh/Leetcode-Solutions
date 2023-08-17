//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printTriangle(n);
        }
    }
}
// } Driver Code Ends



class Solution {

    void printTriangle(int n) {
        for(int rows=0;rows<n;rows++){
            //spaces
        for(int spaces=0;spaces<n-rows-1;spaces++){
            System.out.print(" ");
        }
            //stars
            for(int stars=0;stars<2*rows+1;stars++){
                System.out.print("*");
            }
            // //spaces
            // for(int spaces=0;spaces<=n-rows-1;spaces++){
            //     System.out.print(" ");
            // }
            System.out.println();
        }
    }
}