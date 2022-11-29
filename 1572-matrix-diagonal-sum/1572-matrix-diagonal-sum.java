
        class Solution {
    public int diagonalSum(int[][] mat) {
     int x = mat.length;
        int sum = 0;
        for(int i = 0;i<x;i++){
            for(int j=0;j<x;j++){
                if(i==j){
                    sum = sum + mat[i][j];
                }else if((i+j) == (x-1) ){
                    sum = sum + mat[i][j];
                }
                }
            }
        return sum;
        }
        
    }
     
    
