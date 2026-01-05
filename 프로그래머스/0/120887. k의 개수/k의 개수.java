class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        /*
        for(int a = i; a <= j; a++){
            if(String.valueOf(a).contains(String.valueOf(k))){
                ++answer;
            }
            if(a/k==11) ++answer;
        }
        */
        for (int a = i; a <= j; a++) {
            String s = String.valueOf(a);
            for (char c : s.toCharArray()) {
                if (c == (char) ('0' + k)) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}