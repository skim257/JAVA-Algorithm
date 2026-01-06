class Solution {
    public int[] solution(int[] arr) {
        //int[] answer = {};
        int start = -1;
        int end = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                start = i;
                break; 
            }
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 2) {
                end = i;
                break; 
            }
        }

        int size = end - start + 1;
        int[] answer = new int[size];

        if(start == -1){
            answer[0] = -1;
            return answer;
        }
        
        int index = 0; 
        for (int i = start; i <= end; i++) {
            answer[index] = arr[i]; 
            index++;               
        }
        
        return answer;
    }
}