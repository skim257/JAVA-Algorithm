import java.util.*;

class Solution {
    static class StageInfo {
        int stage;
        double fail;

        StageInfo(int stage, double fail) {
            this.stage = stage;
            this.fail = fail;
        }
    }

    public int[] solution(int N, int[] stages) {
        int[] stay = new int[N + 2]; // 1..N, N+1(클리어)까지 카운트용

        for (int s : stages) {
            stay[s]++;
        }

        int remaining = stages.length; // 해당 스테이지에 도달한 사람 수
        StageInfo[] infos = new StageInfo[N];

        for (int i = 1; i <= N; i++) {
            double fail = 0.0;
            if (remaining > 0) {
                fail = (double) stay[i] / remaining;
            }
            infos[i - 1] = new StageInfo(i, fail);
            remaining -= stay[i]; // i에서 막힌 사람은 다음 스테이지 도달 못 함
        }

        Arrays.sort(infos, (a, b) -> {
            if (b.fail > a.fail) return 1;
            if (b.fail < a.fail) return -1;
            return Integer.compare(a.stage, b.stage); // 실패율 같으면 번호 작은 게 먼저
        });

        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = infos[i].stage;
        }
        return answer;
    }
}