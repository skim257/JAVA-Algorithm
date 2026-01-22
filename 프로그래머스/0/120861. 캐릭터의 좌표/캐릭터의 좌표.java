class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        /*int[] answer = new int[2];
        int cal = 0;
        
        for(String way : keyinput){
            
            switch(way){
                case "up":
                    answer[1] += 1;
                    break;
                case "down":
                    answer[1] -= 1;
                    break;
                case "left":
                    answer[0] -= 1;
                    break;
                case "right":
                    answer[0] += 1;
                    break;
            }
        }
        
        return answer;*/
        int[] answer = {0, 0};
        
        // 1. 맵의 크기에 따라 제한 범위를 동적으로 계산합니다.
        // 예: 11 -> 5,  9 -> 4,  7 -> 3
        int xRange = board[0] / 2;
        int yRange = board[1] / 2;
        
        for(String way : keyinput){
            switch(way){
                case "up":
                    // 2. 위로 가도 되는지(범위를 넘지 않는지) 확인 후 이동
                    if(answer[1] < yRange) { 
                        answer[1]++; 
                    }
                    break;
                    
                case "down":
                    // 아래로 가도 되는지 확인 후 이동
                    if(answer[1] > -yRange) { 
                        answer[1]--; 
                    }
                    break;
                    
                case "left":
                    // 왼쪽으로 가도 되는지 확인 후 이동
                    if(answer[0] > -xRange) { 
                        answer[0]--; 
                    }
                    break;
                    
                case "right":
                    // 오른쪽으로 가도 되는지 확인 후 이동
                    if(answer[0] < xRange) { 
                        answer[0]++; 
                    }
                    break;
            }
        }
        
        return answer;
    }
}