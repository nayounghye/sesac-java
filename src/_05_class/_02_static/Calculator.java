package _05_class._02_static;

// 정적(static) 멤버
// - 객체를 생성할 필요 없이 클래스를 통해서 바로 접근이 가능하다.
// - 클래스가 메모리에 로딩되면 정적 멤버 바로 사용이 가능하다.
// - 사용할 땐 클래스 이름과 함께 점(.) 연산자로 접근이 가능하다.
// - 정적 메소드와 정적 블록은 객체가 없이도 실행이 가능하므로, 내부의 인스턴스 필드나 인스턴스 메소드 사용은 불가능하다.
// - 객체 자신의 참조인 this 도 사용이 불가능하다.
// -
public class Calculator {
    static double pi = 3.141592; // 어떤 계산기든 파이값은 동일하므로 static 으로 선언함!

    // plus, minus 외부에서 주어진 값으로 처리를 하므로 정적 메소드로 처리하는 것이 유리하다.
    // : 메소드의 매개변수가 인스턴스 필드를 이용하지 않으므로!
    static int plus(int x, int y) {return x + y;}
    static int minus(int x, int y) {return  x - y;}

}
