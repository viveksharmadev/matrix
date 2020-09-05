// https://leetcode.com/problems/matrix-diagonal-sum/
class Solution {
    // tc -> m*n, sc-> 1
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        
        int m = mat.length, n = mat[0].length;
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i==j){
                    sum += mat[i][j];
                }
            }
        }
        
        for(int i=0; i<m; i++){
            for(int j=n-1; j>=0; j--){
                if(i+j==n-1 && i!=j){
                    sum += mat[i][j];
                }        
            }            
        }
        
        return sum;
    }
}


class Solution {
    // tc -> m*n, sc-> 1
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        
        int m = mat.length, n = mat[0].length;
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i==j || i+j==n-1){
                    sum += mat[i][j];
                }
            }
        }
        
        return sum;
    }
}

class Solution {
    // tc -> m, sc-> 1
    public int diagonalSum(int[][] mat) {
        int res = 0;
        int m = mat.length;
        for (int i=0; i<m; i++) {
            res += mat[i][i]; // Primary diagonals are row = column! 
            res += mat[m-1-i][i]; // Secondary diagonals are row + column = n-1!
        }
        return m % 2 == 0 ? res : res - mat[m/2][m/2]; // if m is a odd number, that mean we have added the center element twice!
    }
}
