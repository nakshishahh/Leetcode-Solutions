class Solution {
    public int minCostToMoveChips(int[] position) {
                int countEven = 0, countOdd = 0;
        for (int i = 0; i < position.length; i++) {
            if (position[i] % 2 == 0) countEven++;
            else countOdd++; 
        }
        return Math.min(countOdd, countEven);
        
        
    }
}