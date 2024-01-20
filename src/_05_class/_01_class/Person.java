package _05_class._01_class;

public class Person {
    // 필드 (private)
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person codee = new Person();
        codee.age = 10; // 방법1. 이렇게 값을 넣을 수 있으나 권장하지 않음.
        codee.setName("codee"); // 방법2. get/set 사용해서 하는 것을 권장함!

        System.out.println(codee.age); // 방법1. 출력할 때 이렇게 할 수 있으나 권장하지 않음.
        System.out.println(codee.getAge()); //  방법2. get/set 사용해서 하는 것을 권장함!
    }
}
