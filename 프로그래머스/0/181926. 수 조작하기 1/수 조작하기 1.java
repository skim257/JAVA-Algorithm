class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        char[] charArr = control.toCharArray();
        for(int i=0; i<charArr.length; i++){
            if(charArr[i]=='w') n+=1;
            else if(charArr[i]=='s') n-=1;
            else if(charArr[i]=='d') n+=10;
            else if(charArr[i]=='a') n-=10;
        }
        answer = n;
        return answer;
    }
}