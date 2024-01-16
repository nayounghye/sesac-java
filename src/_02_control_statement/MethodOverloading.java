package _02_control_statement;

// 오버로딩
// - 하나의 클래스에서 동일한 이름의 메서드 여러 개를 정의하는 것을 말한다.
// 즉, 이름이 값고 매개변수 타입, 개수, 순서가 다른 경우!
// - 동작이 유사할 때 사용하면 편리하다!
public class MethodOverloading {
    public static void main(String[] args) {
        // 오버로딩한 걸 쓰는 순서
        // 1. 객체 생성
        MethodOverloading ol = new MethodOverloading();
        // 2. 객체를 생성했으므로, 객체의 메서드를 사용할 수 있게 됨!
        System.out.println(ol.add(1,2));
        System.out.println(ol.add(1.1,2.2)); // 값이 지저분하게 나온 이유 : 부동 소수점의 한계
        System.out.println(ol.add(1,2, 3));
        System.out.println(ol.add(1.1,2.2, 3.3));

    }
    public int add(int a, int b) {return  a + b;}
    public double add(double a, double b) {return  a + b;}
    public int add(int a, int b, int c) {return  a + b + c;}
    public double add(double a, double b, double c) {return  a + b + c;}
}
