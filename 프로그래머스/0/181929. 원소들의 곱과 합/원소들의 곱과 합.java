class Solution {
    public int solution(int[] num_list) {
        int answer = 0, num1 = num_list[0], num2 = num_list[0];
        for(int i=1; i<num_list.length; i++){
            num1 *= num_list[i];
            num2 += num_list[i];
        }
        num2 *= num2;
        answer = num1 < num2 ? 1 : 0;
        return answer;
    }
}