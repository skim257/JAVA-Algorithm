import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] strAttr = s.split(""); 
        Arrays.sort(strAttr);
        for(int i=0; i<strAttr.length; i++){
            for(int j=i+1; j<strAttr.length; j++){
                if(strAttr[i].equals(strAttr[j])){
                    s = s.replace(strAttr[i],"");
                }
            }
        }
        
        String[] remaining = s.split("");
        Arrays.sort(remaining);
        answer = String.join("", remaining);
        
        return answer;
    }
}