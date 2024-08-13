import java.util.*;
import java.util.List;
class Solution {
    public int[] solution(int l, int r) {
        //int[] answer = {};
        ArrayList<Integer> answerList = new ArrayList<>();
        for(int i=l; i<=r; i++){
            if(!String.valueOf(i).contains("1")&&
               !String.valueOf(i).contains("2")&&
               !String.valueOf(i).contains("3")&&
               !String.valueOf(i).contains("4")&&
               !String.valueOf(i).contains("6")&&
               !String.valueOf(i).contains("7")&&
               !String.valueOf(i).contains("8")&&
               !String.valueOf(i).contains("9")&&
                String.valueOf(i/5).contains("1")&&
                i%5==0 && 
              (i/5%10==1||i/5%10==0)) 
                answerList.add(i);
        }
        if(answerList.size()<=0) answerList.add(-1);
        int[] answer = answerList.stream()
                .mapToInt(i -> i)
                .toArray();
        
        return answer;
    }
}