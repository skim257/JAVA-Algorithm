import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = Arrays.copyOfRange(arr, 0, arr.length);
        int start = 0; 
        int end = 0;
        int multiple = 0;
        
        for(int j = 0; j<queries.length; j++){
            start = queries[j][0];
            end = queries[j][1];
            multiple = queries[j][2];
            
            for(int i = 0; i<arr.length; i++){
                if(start <= i && i <= end){
                    if(i % multiple == 0){
                        arr[i] = arr[i] + 1;
                    }
                }
            }
        }
        
        answer = Arrays.copyOfRange(arr, 0, arr.length);
        
        return answer;
    }
}