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
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        
        // code here
//         HashMap<Integer,Integer> map = new HashMap<>();
//       int[] ans = new int[2];
//         for(int i = 0;i<n;i++){
//             if(map.containsKey(arr[i])){
//                 map.put(arr[i],map.get(arr[i])+1);
//             }else{
//                 map.put(arr[i],1);
//             }
//         }
        
//         for(int i = 0;i<n;i++){
//                 if(map.get(arr[i])==2){
//                     ans[0]=arr[i];
                
//             }
//             if(!map.containsKey(i+1)){
//                 ans[1]=i+1;
//             }
//         }
//         return ans;
//     }
// }

     
        

        int[] count = new int[n + 1];
        int[] result = new int[2];

        for (int num : arr) {
            count[num]++;
        }

        for (int i = 1; i <= n; i++) {
            if (count[i] == 0) {
                result[1] = i; // Missing number
            } else if (count[i] == 2) {
                result[0] = i; // Duplicate number
            }
        }

        return result;
    }
}
