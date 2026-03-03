class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int coverEnd = 0; // 현재 칠해진(덮인) 구간의 끝 번호

        for (int s : section) {
            if (s > coverEnd) {      // 아직 칠해지지 않은 구역이면
                answer++;
                coverEnd = s + m - 1; // s부터 m칸 덮는다
            }
        }
        return answer;
    }
}