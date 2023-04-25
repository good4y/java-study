package practise.string;

class Test {
    public static void main(String[] args) {

        // StringBuilder와 String의 차이는 단순 연산일 때는 builder가 더 빠르다. 하지만 차이는 미미하다.
        long start = System.nanoTime();
        String str2 = new StringBuilder().append("hello").append("world").toString();

        long end = System.nanoTime();
        System.out.println("stringBuilder: " + (end - start) + " nanoseconds");

        start = System.nanoTime();
        String str1 = "hello" + "world";
        end = System.nanoTime();
        System.out.println("String: " + (end - start) + " nanoseconds");
    }
}
