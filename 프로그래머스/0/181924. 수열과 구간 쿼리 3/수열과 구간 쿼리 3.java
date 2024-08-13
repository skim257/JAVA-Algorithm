class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        int num = 0, num1=0, num2=0;
        for(int i=0; i<queries.length; i++){
            num1 = queries[i][0];
            num2 = queries[i][1];
            num = arr[num1];
            arr[num1] = arr[num2];
            arr[num2] = num;
        }
        answer = arr;
        return answer;
    }
}