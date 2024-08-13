class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        String fig = ineq + eq;
        switch(fig){
            case ">=" : answer = n >= m ? 1 : 0;
                break;
            case "<=" : answer = n <= m ? 1 : 0;
                break;
            case ">!" : answer = n > m ? 1 : 0;
                break;
            case "<!" : answer = n < m ? 1 : 0;
                break;
            default : answer = 0;
                break;
        }
        return answer;
    }
}