class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        char[] str = code.toCharArray();
        for(int i = 0 ; i < code.length(); i++){
            if(str[i] == '1' && mode == 1){
                mode = 0;
            }else if(str[i] == '1' && mode == 0){
                mode = 1;
            }
            
            if(mode == 0 && i%2 == 0 && str[i] != '1'){
                answer += str[i];
            } else if(mode == 1 && i%2 != 0 && str[i] != '1'){
                answer += str[i];
            } 
        }
        
        if(answer == "") answer = "EMPTY";
        
        return answer;
    }
}