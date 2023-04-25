package practise.jvm;

public class InitializeTest {
    public static void main(String[] args) {

        long start = System.nanoTime();
        String b = "b";

        for (int i = 0; i < 100000; i++){
            b += "b";
        }

        long end = System.nanoTime();
        System.out.println("String: " + (end - start) + " nanoseconds");

        String a = "a";

        start = System.nanoTime();
        for(int i = 0; i < 100000; i++){
            a += "a";
        }

        end = System.nanoTime();
        System.out.println("String: " + (end - start) + " nanoseconds");


        String c = "c";

        start = System.nanoTime();
        for(int i = 0; i < 100000; i++){
            c += "c";
        }

        end = System.nanoTime();
        System.out.println("String: " + (end - start) + " nanoseconds");

        String d = "d";

        start = System.nanoTime();
        for(int i = 0; i < 100000; i++){
            d += "d";
        }
        end = System.nanoTime();
        System.out.println("String: " + (end - start) + " nanoseconds");

        String e = "e";

        start = System.nanoTime();
        for(int i = 0; i < 100000; i++){
            e += "e";
        }

        end = System.nanoTime();
        System.out.println("String: " + (end - start) + " nanoseconds");
    }
}
