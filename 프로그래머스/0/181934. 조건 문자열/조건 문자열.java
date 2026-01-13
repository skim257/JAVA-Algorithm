class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        String mul = eq.equals("=") ? ineq+eq : ineq;
        if(mul.equals(">=")){
            answer = n >= m ? 1 : 0;
        }
        else if(mul.equals("<=")){
            answer = n <= m ? 1 : 0;
        }
        else if(mul.equals(">")){
            answer = n > m ? 1 : 0;
        }
        else if(mul.equals("<")){
            answer = n < m ? 1 : 0;
        }
        
        return answer;
    }
}