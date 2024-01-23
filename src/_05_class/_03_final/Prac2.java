package _05_class._03_final;

import java.util.Scanner;

public class Prac2 {
    // 반지름 final 필드
    private final double radius;
    private static final double Pi = 3.141592;

    // 2. 반지름은 생성자를 통해 초기화
    public Prac2(double radius) {
        this.radius = radius;
    }

    // 원 넓이 계산 메소드
    public double circleSize() {
        return radius * radius * Pi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 반지름 입력
        System.out.println("원의 반지름을 입력하세요 : ");
        double radius = sc.nextDouble();
        System.out.println("원의 반지름 : " + radius );

        // circle 객체 생성
        Prac2 circle = new Prac2(radius);

        // 반지름과 넓이 출력
        System.out.println("원의 넓이 : " + circle.circleSize());
        sc.close();

    }
}
