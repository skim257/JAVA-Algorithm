import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char b;
        String result = "";
        for(int i=0; i<a.length(); i++){
            b = a.charAt(i);
            result += Character.isUpperCase(b) ? Character.toLowerCase(b) : Character.toUpperCase(b);
        }
        System.out.print(result);
    }
}