package _05_class._01_class;

import java.util.ArrayList;
import java.util.Scanner;

public class Prac3 {
    // 필드 (private)
    private int width;
    private int height;

    public Prac3(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // getter/setter 사용하기!
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int recSize() {
        return width * height;
    }

    public static void main(String[] args) {
        // Rectangle 객체를 담는 ArrayList 생성
        ArrayList<Prac3> rect = new ArrayList<>();


        Scanner sc = new Scanner(System.in);

        // 사용자로부터 가로와 세로를 입력받아 ArrayList에 Rectangle 인스턴스 차례로 추가
        while (true) {
            // 가로/세로 입력받기!
            System.out.print("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요!");
            int width = sc.nextInt();
            int height = sc.nextInt();

            // 0 0 입력하면 종료하게 만들자!
            if (width == 0 && height == 0) {
                break;
            }

            // 입력 받은 값으로 사각형 객체 생성
            Prac3 rec = new Prac3(width, height);

            // 객체를 ArrayList에 담기
            rect.add(rec);
        }

        // 반복문(for문)을 통해서 지금까지 입력된 ArrayList 출력!
        for (Prac3 rec : rect) {
            System.out.println("가로 길이 : " + rec.getWidth());
            System.out.println("세로 길이 : " + rec.getHeight());
            System.out.println("넓이 : " + rec.recSize());
            System.out.println("-------------------------------");
        }
    }
}

