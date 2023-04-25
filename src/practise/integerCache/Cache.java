package practise.integerCache;

public class Cache {
    public static void main(String[] args) {
        /*
        * Integer Cache : -128 ~ 127까지의 값은 Integer Cache에 저장되어 있다.
        *               Integer Cache는 Integer 클래스의 static 변수로 선언되어 있다.
        *               Integer 배열로 구현되어 있으며 상한은 프로퍼티의 조정을 통해 변경 가능하다.
        * */

        Integer a = 127;
        Integer b = 127;
        System.out.println(a == b);

        Integer c = 128;
        Integer d = 128;
        System.out.println(c == d);
    }
}
