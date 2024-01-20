package _04_exception;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Prac1 {
    public static void main(String[] args) {
//        System.out.println("=== 실습1-1. 예외 처리 ===");
//        int[] nums = {1, 2, 3, 4, 5};
//        try {
//            for (int i = 1; i <= 5; i++) {
//                nums[i] = i;
//                System.out.println(i);
//            }
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("인덱스가 범위를 벗어났습니다.");
//        }
//        Scanner prac1_2 = null;
//        try {
//            System.out.println("=== 실습1-2. 예외 처리 ===");
//            prac1_2 = new Scanner(System.in);
//
//            // 배열 크기 입력
//            System.out.println("배열 크기를 입력하세요.");
//            int num = prac1_2.nextInt();
//
//            // 예외처리: 음수/0 인 경우 경고 메시지 띄우기!
//            if (num <= 0) {
//                throw new IllegalArgumentException("정수만 입력해주세요!!");
//            }
//
//            // 배열 생성 및 요소 입력
//            int[] Array = new int[num];
//            System.out.println(num + "개의 정수를 입력하세요.");
//            int sum = 0;
//            for (int i = 0; i < num; i++) {
//                Array[i] = prac1_2.nextInt();
//                sum += Array[i];
//
//            }
//            // 평균
//            double aver = (double) sum / num;
//            System.out.println();
//            System.out.println("평균 : " + aver);
//
//            //  IllegalArgumentException : 메소드 인수의 유효성 검사할 때 사용.
//        } catch (InputMismatchException e) {
//            System.out.println("InputMismatchException 발생 : 정수만 입력하세요!");
//            // InputMismatchException : 유저 입력 형식과 일치하지 않는 입력을 처리할 때 사용.
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        } finally {
//            // Scanner 닫기
//            prac1_2.close();


        try {
            System.out.println("=== 실습1-3. 예외 처리 ===");
            Scanner prac1_3 = new Scanner(System.in);

            // 배열 크기 입력
            System.out.println("배열 크기를 입력하십시오 : ");
            int number = prac1_3.nextInt();

            // 예외처리: 음수/0 인 경우 경고 메시지 띄우기!
            if (number <= 0) {
                throw new IllegalArgumentException("정수만 입력해주세요!!");
            }
            // 배열 요소 입력
            ArrayList<Integer> arrlist = new ArrayList<>();
            System.out.println("배열 요소를 입력하십시오.");
            for (int i = 0; i < number; i++) {
                int element = prac1_3.nextInt();
                // 중복 검사!!
                if (arrlist.contains(element)) {
                    System.out.println("중복된 요소 : " + element);
                } else {
                    arrlist.add(element);
                }
            }
            // 중복 요소 없는 경우
            if (arrlist.isEmpty()) {
                System.out.println("중복된 요소가 없습니다!");
            }
            // 예외 처리
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException 발생!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }


}

