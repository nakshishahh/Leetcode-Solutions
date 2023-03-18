//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            Pair ans = new Solve().getFloorAndCeil(arr, n, x);
            System.out.println(ans.floor + " " + ans.ceil);
        }
    }
}

class Pair {
    int floor, ceil;

    Pair() {
        this.floor = 0;
        this.ceil = 0;
    }

    Pair(int floor, int ceil) {
        this.floor = floor;
        this.ceil = ceil;
    }
}

// } Driver Code Ends


//User function Template for Java




class Solve {
    Pair getFloorAndCeil(int[] nums, int n, int target) {
        Arrays.sort(nums);
        Pair p1 = new Pair();
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(nums[mid]==target){
                return new Pair(nums[mid] , nums[mid]);
            }else if(nums[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
             if(end < 0){
            p1.ceil = nums[start];
            p1.floor = -1;
        }else if(start >= n){
            p1.floor = nums[end];
            p1.ceil = -1;
        }else{
            p1.floor = nums[end];
            p1.ceil = nums[start];
        }
        return p1 ;
        
    }
}
        
        // code here
    

