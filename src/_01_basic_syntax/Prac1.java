package _01_basic_syntax;

import java.util.Scanner;

public class Prac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력하세요.");
        String name = sc.next();
        System.out.println("나이를 입력하세요.");
        int age = sc.nextInt();


        System.out.println("=== 실습 1 ====");
        System.out.println("안녕하세요! " + name + "님 (" + age + "세)");
        System.out.printf("안녕하세요! %s님. %d세 이시네요!", name, age);
        sc.close(); // scanner 닫기.

    }
}
