import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        /*//String[] answer = {};
        List<String> answer = new ArrayList<>();
        
        String[] arr = myStr.replace("a"," ");
        arr = arr.replace("b", " ");
        arr = arr.replace("c", " ");
        
        answer = arr.split(" ");
        
        if(answer == null){
            answer.add("EMPTY");
        }
        
        return answer;*/
        
        String replaced = myStr.replace("a", " ")
                               .replace("b", " ")
                               .replace("c", " ");

        String[] parts = replaced.split(" ");

        List<String> result = new ArrayList<>();
        for (String p : parts) {
            if (!p.isEmpty()) {
                result.add(p);
            }
        }

        if (result.isEmpty()) {
            return new String[] { "EMPTY" };
        }

        return result.toArray(new String[0]);
    }
}