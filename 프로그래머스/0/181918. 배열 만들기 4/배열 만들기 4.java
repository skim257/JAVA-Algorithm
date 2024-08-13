import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        //int[] stk = {};
        ArrayList<Integer> stkList = new ArrayList<>();
        int listSize = 0;
        
        for(int i=0; i<arr.length;){
            listSize = stkList.size();
            if(listSize == 0) 
            {
                stkList.add(arr[i]);
                i++;
            }
            
            if(listSize > 0 && i < arr.length &&
                    stkList.get(stkList.size() - 1) < arr[i]) 
            {
                stkList.add(arr[i]);
                i++;
            }
            //System.out.println("i ="+i+" : "+stkList);
            if(listSize > 0 && i < arr.length &&
                    stkList.get(stkList.size() - 1) >= arr[i]) 
                stkList.remove(stkList.size() - 1);
            //System.out.println("i ="+i+" : "+stkList);
        }
        
        int[] stk = stkList.stream()
                .mapToInt(j -> j)
                .toArray();
        return stk;
    }
}