class Solution {
    public String solution(String my_string, int[][] queries) {
        //String answer = "";
        String[] arr = my_string.split("");
        
        for(int i=0; i<queries.length; i++){
            int start = queries[i][0];
            int end = queries[i][1];
            while (start < end){
                 String tmp = arr[start];
                arr[start] = arr[end];
                arr[end] = tmp;
                start++;
                end--;
            }
            /*for(int j=start; j<end-start; j++){
                String tmp = arr[j];
                arr[j] = arr[end];
                arr[end] = tmp;
                end--;
            }*/
        }

        return String.join("", arr);
    }
}