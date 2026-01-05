class Solution {
    public int solution(int[] array, int n) {
        /*int answer = 0;
        int re = 0;
        int[] cal = new int[array.length];
        
        for(int i = 0; i<array.length; i++){
            if(array[i]-n > 0) cal[i] = array[i] - n;
            else cal[i] = - (array[i] - n);
        }
        
        
        for(int j=0; j<cal.length-1; j++){
            if(cal[j] > cal[j+1]){
                answer = array[j];
            }
            else {
                continue;
            }
        }
        */
        /*
        int min = cal[0];
        
        for (int j = 1; j < cal.length; j++) {
            if (cal[j] < min) {
                min = cal[j];
                answer = array[j];
            }
            else if (cal[j] == min && array[j] < answer) {
                answer = array[j];
            }
        }
        
        return answer;
        */
        int best = array[0];
        int minDiff = Math.abs(array[0] - n);

        for (int i = 1; i < array.length; i++) {
            int diff = Math.abs(array[i] - n);

            // 더 가까우면 갱신
            if (diff < minDiff) {
                minDiff = diff;
                best = array[i];
            }
            // 거리 같으면 더 작은 수 선택
            else if (diff == minDiff && array[i] < best) {
                best = array[i];
            }
        }

        return best;  
    }
}