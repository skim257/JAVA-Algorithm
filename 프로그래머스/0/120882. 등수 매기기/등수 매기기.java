class Solution {
    public int[] solution(int[][] score) {
        /*int[] answer = new int[score.length];
        
        int[] avg = new int[score.length];
        for(int i = 0; i<avg.length; i++){
            int eng = score[i][0];
            int math = score[i][1];
            avg[i] = (eng + math) / 2;
        }
        
        for(int i = 0; i < avg.length; i++) {
            int rank = 1;
            for(int j = 0; j < avg.length; j++) {
                if(avg[j] > avg[i]) {
                    rank++;
                }
            }
            answer[i] = rank;
        }
        
        return answer;*/
        int n = score.length;
        int[] answer = new int[n];
        int[] sums = new int[n];
        
        for(int i = 0; i < n; i++){
            sums[i] = score[i][0] + score[i][1];
        }
        
        for(int i = 0; i < n; i++) {
            int rank = 1;
            for(int j = 0; j < n; j++) {
                if(sums[j] > sums[i]) {
                    rank++;
                }
            }
            answer[i] = rank;
        }
        
        return answer;
    }
}