class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        int last = num_list[num_list.length-1];
        int last2 = num_list[num_list.length-2];
        int num = (last>last2) ? last-last2 : last*2;
        for(int i = 0; i<num_list.length; i++){
            answer[i] = num_list[i];
        }
        answer[answer.length-1] = num;
        return answer;
    }
}