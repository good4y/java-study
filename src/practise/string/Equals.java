package practise.string;

class Equals {
    public static void main(String[] args) {

        String s1 = new String("java"); // 힙 메모리에 생성
        String s2 = new String("java");

        String s3 = "java"; // String pool에 생성
        String s4 = "java";
        // == : 객체의 주소값 비교
        // equals() : 객체의 값 비교

        System.out.println(s1 == s2);       // 힙 메모리 내에 서로 다른 주소값을 가진다.
        System.out.println(s1 == "java");   // String pool의 "java"와 new Keyword로 만든 new("java")는 다른 주소값을 가진다
        System.out.println(s3 == "java");   // String pool의 "java"와 new Keyword로 만든 new("java")는 다른 주소값을 가진다
        System.out.println(s3 == s4);       // String pool 에서 주소값이 같다

        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s4));

        System.out.println(s1.hashCode());
        System.out.println(s4.hashCode());
    }
}
