class Solution {
    public int findNumbers(int[] nums) {
        int x = nums.length;
        int i = 0;
        int sum = 0;
        while(x>0){
            int count = 0;
            while(nums[i]>0){
                count++;
                nums[i] = nums[i]/10;
            }
            if(count%2==0){
                sum = sum+1;
            }
            i++;
            x--;
        }
        return sum;
        
    }
}