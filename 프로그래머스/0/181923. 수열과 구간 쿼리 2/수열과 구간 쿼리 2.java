class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for(int j=0; j<queries.length; j++){
            int start = queries[j][0];
            int end = queries[j][1];
            int k = queries[j][2];
            int min = -1;
            
            for(int i=start; i<=end; i++){
                if(arr[i] > k){
                    if(min == -1){
                        min = arr[i];
                    }
                    
                    if(arr[i] < min){
                        min = arr[i];
                    }
                }
            }
            
            answer[j] = min;
        }
        
        
        return answer;
    }
}