import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya","ye","woo","ma"};
        
         for (String s : babbling) {
            int i = 0;
            int prev = -1;
            boolean ok = true;

            while (i < s.length()) {
                boolean matched = false;

                for (int w = 0; w < words.length; w++) {
                    if (s.startsWith(words[w], i)) {
                        if (prev == w) {
                            ok = false;
                        } else {
                            prev = w;
                            i += words[w].length();
                            matched = true;
                        }
                        break;
                    }
                }

                if (!matched) {
                    ok = false;
                    break;
                }
            }

            if (ok) answer++;
        }
        
        return answer;
    }
}