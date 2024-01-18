package _03_array;

import java.util.Scanner;

public class Prac1 {
    public static void main(String[] args) {
        System.out.println("=== 실습1. 배열 ===");
        Scanner sc = new Scanner(System.in);
        System.out.println("5개의 정수를 입력하세요.");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        int[] intArray = { a, b, c, d, e };

        int sum = 0;
        for( int i=0; i<intArray.length; i++) {
           sum += intArray[i];
        }
        double average = (double) sum / intArray.length; // 평균 계산
        System.out.println("평균은 " + average);


        //        루나 리더님 답변
        Scanner scanner = new Scanner(System.in);

        // 5개의 정수를 입력 받을 배열 생성
        int [] nums =  new int[5];

        System.out.println("5개의 정수를 입력하세요.");

        // 사용자로부터 5개의 정수를 입력 받기
        for (int i = 0; i < 5; i ++) {
            nums[i] = scanner.nextInt();
        }

        // 평균 계산
        double sum2 = 0;
        for (int number : nums) {
            sum += number;
        }
        double average2 = sum2 /5;
        System.out.println("평균은 " + average2);



    }
}
