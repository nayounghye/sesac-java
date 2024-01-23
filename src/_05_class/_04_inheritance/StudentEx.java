package _05_class._04_inheritance;

public class StudentEx {
    public static void main(String[] args) {
        Student std1 = new Student("죠르디",999);

//        // Case1. 부모, 자식 클래스의 필드가 public 인 경우
//        // Person(부모) 클래스로부터 상속받은 필드 값 읽기
//        System.out.println(std1.name); // 출력값: 죠르디
//        System.out.println(std1.age); // 출력값 : 999
//
//        // 자식 클래스 필드 값 읽기
//        System.out.println(std1.campus); // 출력값 : null -> setter 실행을 안해서!
//
//        // Person 으로 부터 상속받은 메소드 호출
//        std1.say();
//        std1.eat("사과");
//
//        // Student 메소드 호출
//        std1.setCampus("새싹 용산");

        ///////////////////////////////////////////////////
        // Case 2. 부모, 자식 클래스의 필드가 private 인 경우
        // Person 으로부터 상속받은 필드를 읽기
        System.out.println(std1.getName());
        System.out.println(std1.getAge());

        // Student 필드 읽기
        System.out.println(std1.getCampus());

        // Person 으로부터 상속 받은 메소드 호출
        std1.say(); // public 메소드

        // Student 메소드 호출
        std1.setCampus("새싹 용산");
    }
}
