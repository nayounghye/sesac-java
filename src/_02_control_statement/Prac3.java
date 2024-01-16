package _02_control_statement;

import java.util.Scanner;

public class Prac3 {
    public static void main(String[] args) {
        System.out.println("=== 실습3. 반복문 ===");
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++)
            System.out.print(i+ " ");
        sc.close();
    }
}
