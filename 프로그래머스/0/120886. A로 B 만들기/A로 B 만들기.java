import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        /*String str = "";
        String[] strArr = before.split("");
        for(int i = strArr.length-1; i >= 0; i--){
            str += strArr[i];
        }
        
        //if(str.equals(after)) answer = 1;
        //else answer = 0;
        answer = str.equals(after)? 1 : 0;
        */
        
        char[] beforeChars = before.toCharArray();
        char[] afterChars = after.toCharArray();
        
        Arrays.sort(beforeChars);
        Arrays.sort(afterChars);
        
        before = new String(beforeChars);
        after = new String(afterChars);
        
        answer = before.equals(after) ? 1 : 0;
        
        return answer;
    }
}