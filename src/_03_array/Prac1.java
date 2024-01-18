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


    }
}
