package _05_class._03_final;

public class Student {
    // final 필드
    // 초기화 하는 방법 2가지
    final String campus = "용산"; // 방법1. 필드 선언시 초기화
    final String sid; // 방법2. 생성자에서 초기화

    public Student(String sid) {
        this.sid = sid;
    }

    public static void main(String[] args) {
        Student std1 = new Student("soo1");
        System.out.println(std1.campus);
        System.out.println(std1.sid);

        // final 필드 값 변경 불가능
        // std1.campus = "영등포"; // 에러 발생
    }
}
