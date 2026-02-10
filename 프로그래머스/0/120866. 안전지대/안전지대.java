class Solution {
    public int solution(int[][] board) {
        int len = board.length;
        int n = board.length;
        int[][] dangerBoard = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                
                if (board[i][j] == 1) {
                    markDanger(i, j, n, dangerBoard);
                }
            }
        }
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (dangerBoard[i][j] == 0) {
                    count++;
                }
            }
        }
        
        return count;
    }
    
    void markDanger(int row, int col, int n, int[][] dangerBoard) {
        // 내 위치 기준 위(-1)부터 아래(+1)까지
        for (int i = row - 1; i <= row + 1; i++) {
            // 내 위치 기준 왼쪽(-1)부터 오른쪽(+1)까지
            for (int j = col - 1; j <= col + 1; j++) {
                
                // ⭐ 중요: 배열 밖으로 나가지 않는지 체크!
                if (i >= 0 && i < n && j >= 0 && j < n) {
                    dangerBoard[i][j] = 1; // 위험하다고 표시
                }
            }
        }
    }
}