class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String [] bab = {"aya", "ye", "woo", "ma"};
        
        /*
        for(int i=0; i<babbling.length; i++)
        {
            for(int j=0; j<bab.length; j++){
                String[] arr = babbling[i].split(bab[j]);
                if(arr.length > 0) {
                    answer++;
                    break;
                }
            }
        }
        */
        for (String word : babbling) {
            String tmp = word;
            for (String b : bab) {
                tmp = tmp.replace(b, " ");
            }
            if (tmp.replace(" ", "").isEmpty()) {
                answer++;
            }
        }
        return answer;
    }
}