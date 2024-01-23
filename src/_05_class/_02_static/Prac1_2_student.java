package _05_class._02_static;

public class Prac1_2_student {
    // Student 클래스는 이름(name), 학번(student_ID), 학년(grade)을 저장함
    private String name;
    private int student_ID;
    private int grade;

    // 클래스 변수 (static 변수) totalStudents 생성해 전체 학생 수 저장
    private static int totalStudent = 0;

    // 생성자로 이름, 학번, 학년 초기화 및 totalStudent 증가
    public Prac1_2_student(String name, int student_ID, int grade) {
        this.name = name;
        this.student_ID = student_ID;
        this.grade = grade;
        totalStudent++;
    }

    // 각 필드에 대한 getter, setter 추가
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudent_ID() {
        return student_ID;
    }

    public void setStudent_ID(int student_ID) {
        this.student_ID = student_ID;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.println("==== 학생 정보 ====");
        System.out.println("이름 : " + name);
        System.out.println("학번 : " + student_ID);
        System.out.println("학년 : " + grade);
    }

    // 클래스 변수 getter
    public static int getTotalStudent() {
        return totalStudent;
    }

    public static void main(String[] args) {
        // student 객체 생성
        Prac1_2_student student1 = new Prac1_2_student("죠르디", 20240123, 1);
        Prac1_2_student student2 = new Prac1_2_student("스카피", 20230123, 2);
        Prac1_2_student student3 = new Prac1_2_student("앙몬드", 20220123, 3);
        Prac1_2_student student4 = new Prac1_2_student("판다주니어", 20210123, 4);

        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
        student4.displayInfo();

        System.out.println("총 학생 수는 "+Prac1_2_student.getTotalStudent()+"명 입니다.");

    }

}
