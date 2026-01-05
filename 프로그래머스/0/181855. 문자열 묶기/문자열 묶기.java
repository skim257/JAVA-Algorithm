import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        /*int answer = 0;
        int[] strIntArr = new int[strArr.length];
        int max = 0;
        List<String> list = new ArrayList<>();
        
        for(int i = 0; i<strArr.length; i++){
            for(int j=0; j<strArr.length; j++){
                if(i==j) continue;
                if(strArr[i].length() == strArr[j].length()){
                    list.add(strArr[i]);
                }
            }
        }
        
        
        return answer;*/
        // 문자열 길이 범위: 1 ~ 30
        int[] cnt = new int[31];
        int max = 0;

        for (String s : strArr) {
            int len = s.length();
            cnt[len]++;
            if (cnt[len] > max) max = cnt[len];
        }

        return max;
    }
}