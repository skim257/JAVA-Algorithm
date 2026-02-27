import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        
        int n = score.length;
        int boxes = n / m;
        int start = n - boxes * m; // 남는 사과 버리고 시작점
        
        for (int i = start; i < n; i += m) {
            answer += score[i] * m;
        }
        return answer;
    }
}