package _03_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Prac2 {
    public static void main(String[] args) {
        System.out.println("=== 실습2. ArrayList ===");
        ArrayList<String> text = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("문자를 입력해주세요.");
        String n = sc.next();

        text.add(n);
    }
}
