class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int arr : array){
            String a = arr+"";
            String[] strArr = a.split("");
            for(String str : strArr){
                if(str.equals("7")) ++answer;
            }
        }
        
        return answer;
    }
}