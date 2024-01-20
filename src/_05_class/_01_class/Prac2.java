package _05_class._01_class;

import java.util.Scanner;

public class Prac2 {
    // 필드 (변수) -> 가로/세로
    public static int width;
    public static int height;

    // 생성자
    // 생성자가 호출되는 시점은 객체가 만들 때이다!
    public Prac2(int width, int height) {
        // 지역변수랑 필드 변수명이 동일하기 때문에 this 사용해서 필드값에 접근한다!
        // 비어있는 w,h값을 오버라이딩을 통해 w과 h값을 덮어쓰기 할 것!
        this.width = width;
        this.height = height;
    }

    // 메소드 (함수) -> 넓이 구하는 메소드
    public int recSize() {
        return width * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 가로/세로 입력받기!
        System.out.print("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요!");
        int width = sc.nextInt();
        int height = sc.nextInt();


        // 입력 받은 값으로 사각형 객체 생성
        Prac2 rec = new Prac2(width, height);

        // 넓이 구하기!!
        System.out.println("사각형의 넓이 : " + rec.recSize());

        sc.close();
    }

}


