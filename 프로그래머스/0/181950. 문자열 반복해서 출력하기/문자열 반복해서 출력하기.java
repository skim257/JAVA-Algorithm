import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        String tmp = "";
        for(int i=0; i<n; i++){
            tmp += str;
        }
        System.out.println(tmp);
    }
}