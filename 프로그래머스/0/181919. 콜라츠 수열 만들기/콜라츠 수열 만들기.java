import java.util.*;
import java.util.List;
class Solution {
    public int[] solution(int n) {
        //int[] answer = {};
        ArrayList<Integer> answerList = new ArrayList<>();
        while(n>1){
            if(answerList.size() == 0) answerList.add(n);
            if(n%2==0){
                n = n/2;
                answerList.add(n);
            }
            else{
                n = 3 * n + 1;
                answerList.add(n);
            }
        }
        
        int[] answer = answerList.stream()
                .mapToInt(i -> i)
                .toArray();
        return answer;
    }
}