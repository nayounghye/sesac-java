package _05_class._01_class;

import java.util.Scanner;

public class Prac2 {
    // 필드 (변수) -> 가로/세로
    public static int width;
    public static int height;

    // 생성자
    // 생성자가 호출되는 시점은 객체가 만들 때이다!
    public Prac2(int width, int height) {
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
        width = sc.nextInt();
        height = sc.nextInt();


        // 사각형 객체 생성
        Prac2 rec = new Prac2(width, height);

        // 넓이 구하기!!
        int size = rec.recSize();
        System.out.println("사각형의 넓이 : " + size);

    }

}


