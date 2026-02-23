class Solution {
    public int solution(int[][] lines) {
        int answer = 0;

        int offset = 100;
        int[] count = new int[205];

        for (int i = 0; i < lines.length; i++) {
            int start = lines[i][0];
            int end = lines[i][1];

            for (int x = start; x < end; x++) {  
                count[x + offset]++;
            }
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] >= 2) answer++;
        }

        return answer;
    }
}