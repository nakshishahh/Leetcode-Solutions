class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
                int x = image.length;
        int[][] s = new int[x][x];
        for(int i =0;i<x;i++){
            for(int j = 0;j<x;j++){
                s[i][j] = image[i][(x-1)-j];
            }
            
        }
        for(int i =0;i<x;i++){
            for(int j = 0;j<x;j++){
                if(s[i][j]==0){
                    s[i][j] = 1;
                }else{
                    s[i][j] = 0;
                }
            }
        }
        return s;
        
            
        }
        
    }
        
    
