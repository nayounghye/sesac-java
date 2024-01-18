package _02_control_statement;

import java.util.Scanner;

public class Prac4 {
    public static void main(String[] args) {

        System.out.println("=== 실습4-1. 메소드 ===");
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 두 개를 입력하세요.");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println("덧셈 결과 : " + add(a, b));
        System.out.println("뺄셈 결과 : " + minus(a, b));
        System.out.println("나눗셈 결과 : " + division(a, b));
        System.out.println("곱셈 결과 : " + multiplication(a, b));


        System.out.println("=== 실습4-2. 오버로딩 ===");
        Prac4 prac = new Prac4();
        System.out.println("반지름이 5인 원의 넓이 : " + prac.hateMath(5));
        System.out.println("가로 4, 세로 7인 직사각형의 넓이 : " + prac.hateMath(4,7));
        System.out.println("밑변 6, 높이 3인 삼각형의 넓이 : " + prac.hateMath(6.0,3.0));
    }

    //    실습 4-1. 메소드
    public static double add(double a, double b) {return  a + b;}
    public static double minus(double a, double b) {return  a - b;}
    public static double division(double a, double b) {return  a / b;}
    public static double multiplication(double a, double b) {return  a * b;}

    //    실습 4-2. 오버로딩
    public double hateMath(double a) {return 3.14 * a * a;}
    public double hateMath(int a, int b) {return a * b;}
    public double hateMath(double a, double b) {return a * b / 2;}

}
