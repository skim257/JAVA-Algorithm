import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int num = 0, min = 0, arridx1 = 0, arridx2 = 0;
        ArrayList<Integer> numArr = new ArrayList<>();
        
        for(int i=0; i<queries.length; i++){
            numArr = new ArrayList<>();
            arridx1 = queries[i][0];
            arridx2 = queries[i][1];
            for(int arrNum=arridx1; arrNum<=arridx2; arrNum++){
                if(arr[arrNum] > queries[i][2]){
                    numArr.add(arr[arrNum]);
                }
            }
            if(numArr.size()==0) numArr.add(-1);
            min = Collections.min(numArr);
            answer[i] = min;
        }
        return answer;
    }
}