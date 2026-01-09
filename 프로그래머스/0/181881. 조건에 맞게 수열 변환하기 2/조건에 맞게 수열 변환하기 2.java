import java.util.Arrays;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] before = new int[arr.length];
        int[] after = new int[arr.length];
        
        /*
        while(!Arrays.equals(before, after)){
           before = Arrays.copyOfRange(arr, 0, arr.length);
           for(int i=0; i<arr.length; i++){
                if(arr[i] >= 50 && arr[i]%2==0){
                    arr[i] = arr[i]/2;
                }
                else if( arr[i] <= 50 && arr[i]%2==1){
                    arr[i] = arr[i]*2+1;
                }
                else continue;
            } 
            after = Arrays.copyOfRange(arr, 0, arr.length);
            answer += 1;
        }
        
        answer -= 1;
        */
        
        while (true) {
            before = Arrays.copyOf(arr, arr.length);

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) { 
                    arr[i] = arr[i] * 2 + 1;
                }
            }

            after = Arrays.copyOf(arr, arr.length);

            if (Arrays.equals(before, after)) break; 
            answer++;
        }
        return answer;
    }
}