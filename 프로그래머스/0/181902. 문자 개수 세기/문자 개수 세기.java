class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for(int i=0; i<my_string.length(); i++){
            char c = my_string.charAt(i);
            //int index = c - '65';
            //answer[index] += 1;
            if (c >= 'A' && c <= 'Z') {
                int index = c - 'A';
                answer[index]++;
            } else if (c >= 'a' && c <= 'z') {
                int index = c - 'a' + 26;
                answer[index]++;
            }
        }
        
        return answer;
    }
}