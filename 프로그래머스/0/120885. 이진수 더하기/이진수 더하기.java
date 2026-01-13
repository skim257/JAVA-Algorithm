class Solution {
    public String solution(String bin1, String bin2) {
        /*String answer = "";
        String[] arr1 = bin1.split("");
        String[] arr2 = bin2.split("");
        
        int num1 = 0;
        int num2 = 0;
        int result = 0;
        
        for(int i=arr1.length; i>0; i--){
            num1 += Integer.parseInt(arr1[i]) * (i*2);
        }
        
        for(int j=arr2.length; j>0; j--){
            num2 += Integer.parseInt(arr2[j]) * (j*2);
        }
        
        result = num1 + num2;
        
        while (result > 0) {
            int remainder = result % 2; 
            answer = remainder + answer; 
            result = result / 2; 
        }

        return answer;*/
        // 1. 2진수 문자열을 10진수 숫자(int)로 변환
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);

        // 2. 두 숫자를 더함
        int sum = num1 + num2;

        // 3. 더한 결과를 다시 2진수 문자열로 변환하여 리턴
        return Integer.toBinaryString(sum);
    }
}