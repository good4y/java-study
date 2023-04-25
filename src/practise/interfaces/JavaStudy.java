package practise.interfaces;

public class JavaStudy extends Latte implements Puding{
    @Override
    public void run() {
        Puding.super.run();
    }

    public static void main(String[] args) {
        JavaStudy javaStudy = new JavaStudy();
        javaStudy.run();
        javaStudy.bark();
        ((Puding)javaStudy).bark();
    }
}


// 추상클래스가 먼저 나와서 추상클래스의 메서드를 인터페이스의 메서드보다 우선시 할 수 밖에 없다 (하위호환성)
// 추상클래스가 인터페이스에 비해 더 구체적으로 정의되어 있다.
// 모든 인터페이스는 암시적으로 abstract https://docs.oracle.com/javase/specs/jls/se20/html/jls-9.html#jls-9.1.1
// 인터페이스는 가장 최근의 구현체를 따른다. https://docs.oracle.com/javase/specs/jls/se20/html/jls-9.html#jls-9.4.1
// 캐스팅 https://docs.oracle.com/javase/specs/jls/se20/html/jls-5.html#d5e8237