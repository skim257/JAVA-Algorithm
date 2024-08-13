class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        char[] arr_my = my_string.toCharArray();
        char[] arr = overwrite_string.toCharArray();
        for(int i=0; i<overwrite_string.length(); i++){
            arr_my[s+i] = arr[i]; 
        }
        answer = new String(arr_my);
        return answer;
    }
}