class Solution {
    public long solution(String numbers) {
        /*long answer = 0;
        
        if(numbers.contains("one")){
            numbers = numbers.replaceAll("one", "1");
        }
        if(numbers.contains("two")){
            numbers = numbers.replaceAll("two", "2");
        }
        if(numbers.contains("three")){
            numbers = numbers.replaceAll("three", "3");
        }
        if(numbers.contains("four")){
            numbers = numbers.replaceAll("four", "4");
        }
        if(numbers.contains("five")){
            numbers = numbers.replaceAll("five", "5");
        }
        if(numbers.contains("six")){
            numbers = numbers.replaceAll("six", "6");
        }
        if(numbers.contains("seven")){
            numbers = numbers.replaceAll("seven", "7");
        }
        if(numbers.contains("eight")){
            numbers = numbers.replaceAll("eight", "8");
        }
        if(numbers.contains("nine")){
            numbers = numbers.replaceAll("nine", "9");
        }
        
        answer = Long.parseLong(numbers);
        
        return answer;*/
        // 영단어 배열 (인덱스가 곧 숫자와 일치함: 0="zero", 1="one"...)
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        // 0부터 9까지 반복하면서 다 바꿔줌
        for (int i = 0; i < words.length; i++) {
            // words[i]를 숫자 i로 변환
            numbers = numbers.replaceAll(words[i], String.valueOf(i));
        }
        
        // 대문자 Long 사용
        return Long.parseLong(numbers);
    }
}