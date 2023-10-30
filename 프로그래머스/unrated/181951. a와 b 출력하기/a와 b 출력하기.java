import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(-100000 > a || b > 100000){
            System.out.println("입력 된 숫자가 지정된 범위를 벗어납니다.");
        }
        

        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
    }
}