package _02_control_statement;

import java.util.Scanner;

public class Prac2 {
    public static void main(String[] args) {
        System.out.println("=== 조건문 실습 1 ===");
        Scanner sc = new Scanner(System.in);
        System.out.println("나이를 입력하세요.");
        int age = sc.nextInt();
        if (1 <= age && age <= 7) {
            System.out.println("유아");
        } else if (8 <= age &&  age <= 13 ) {
            System.out.println("초등학생");
        }else if (14 <= age &&  age <= 16 ) {
            System.out.println("중학생");
        }else if (17 <= age &&  age <= 19 ) {
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
    }

        System.out.println("=== 조건문 실습 2 ===");
        Scanner sc2 = new Scanner(System.in);
        System.out.println("이름을 입력하세요.");
        String name = sc2.next();
        if (name.equals("홍길동")) {
            System.out.println("남자");
        } else if (name.equals("성춘향")) {
            System.out.println("여자");
    } else {
            System.out.println("모르겠어요@.@");
        }
}}
