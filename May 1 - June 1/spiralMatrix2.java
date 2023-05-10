class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int cnt = 1, tne = n*n, up = 0, left = 0, down = n-1, right = n-1;
        while(cnt<= tne){
            for(int i = left;i<=right && cnt<=tne;i++){
                matrix[up][i] = cnt++;
            }
            for(int i = up+1;i<=down -1 && cnt<=tne;i++){
                matrix[i][right] = cnt++;
            }
            for(int i = right;i>=left && cnt<=tne;i--){
                matrix[down][i] = cnt++;
            } 
            for(int i = down-1;i>=up+1 && cnt<=tne;i--){
                matrix[i][left] = cnt++;
            }
            up ++;right --;down --; left++;
        }
        return matrix;
    }
}


