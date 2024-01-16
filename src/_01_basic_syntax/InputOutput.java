package _01_basic_syntax;

import java.util.Scanner;

// 입출력
public class InputOutput {
    public static void main(String[] args) {
       // 출력
        System.out.print("안녕하세요, \n"); // "\n" : 엔터 역할 다음 줄은 줄바꿈되어 입력됨.
        System.out.println("저는 김새싹입니다!");
        System.out.println("잘 부탁드립니다.");

        // 입력
        // - Scanner 클래스 이용
        System.out.println("공백으로 구분하여 이름/나이/키/결혼여부를 입력해주세요 >>");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next(); // 공백 이전까지 문자열 읽음.
        int age = scanner.nextInt(); // 공백 이전까지 정수 읽음.
        double height = scanner.nextDouble(); // 공백 이전까지 실수 읽음.
        boolean single = scanner.nextBoolean(); // 공백 이전까지 불리언 읽음.

        System.out.println("=== 입력 결과 출력 ===");
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("키 : " + height);
        System.out.println("결혼여부 : " + single);

        scanner.close(); // scanner 닫기.

    }
}
