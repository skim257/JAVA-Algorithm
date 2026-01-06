class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        my_string = my_string.replaceAll("[^0-9]", " ");
        String[] arrList = my_string.split(" ");
        for(String arr : arrList){
            if(!arr.equals("")) {
                answer += Integer.parseInt(arr);
            }
        }
        
        return answer;
    }
}