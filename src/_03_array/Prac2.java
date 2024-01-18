package _03_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Prac2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> stringList = new ArrayList<>();

        System.out.println("문자열을 입력하세요. : ");
        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            // ArrayList에 입력받은 문자열 추가
            stringList.add(input);
        }
        System.out.println("\n입력된 문자열 목록:");
        // ArrayList에 있는 값들 출력
        for (String str : stringList) {
            System.out.println(str);
        }
        // Scanner 닫기
        scanner.close();
    }
}
