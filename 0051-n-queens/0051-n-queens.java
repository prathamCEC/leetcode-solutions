class Solution {
    List<List<String>> result = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++)
            Arrays.fill(board[i],'.');
        boolean[] cols = new boolean[n];
        boolean[] dig1 = new boolean[2*n-1];
        boolean[] dig2 = new boolean[2*n-1];
        backtrack(0,n,board,cols,dig1,dig2);
        return result;
    }
        void backtrack(int row, int n,char[][] board,boolean[] cols,boolean[] diag1,boolean[] diag2){
            if(row == n){
                List<String> current = new ArrayList<>();
                for(char[] r : board)
                    current.add(new String(r));
                result.add(current);
                return;
            }
            for(int col = 0; col<n; col++){
                int d1 = row-col+n-1;
                int d2 = row+col;
                if(cols[col]||diag1[d1]||diag2[d2])
                    continue;
                board[row][col] = 'Q';
                cols[col] = true;
                diag1[d1] = true;
                diag2[d2] = true;
                backtrack(row+1,n,board,cols,diag1,diag2);
                board[row][col] = '.';
                cols[col] = false;
                diag1[d1] = false;
                diag2[d2] = false;
            }
        }
}