package practise.string;

class TimeStamp {
    public static void main(String[] args) {
        String s = "Hello";
        StringBuffer sb = new StringBuffer("Hello");
        StringBuilder sbd = new StringBuilder("Hello");
        long start;
        long end;
        System.out.println("APPEND");

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            s += " world";
        }

        end = System.nanoTime();
        System.out.println("String: " + (end - start) + " nanoseconds");

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            sb.append(" world");
        }
        end = System.nanoTime();
        System.out.println("StringBuffer: " + (end - start) + " nanoseconds");

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            sbd.append(" world");
        }
        end = System.nanoTime();
        System.out.println("StringBuilder: " + (end - start) + " nanoseconds");


        System.out.println("REVERSE");


        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            s = new StringBuilder(s).reverse().toString();
        }
        end = System.nanoTime();
        System.out.println("String: " + (end - start) + " nanoseconds");

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            sb.reverse();
        }
        end = System.nanoTime();
        System.out.println("StringBuffer: " + (end - start) + " nanoseconds");

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            sbd.reverse();
        }
        end = System.nanoTime();
        System.out.println("StringBuilder: " + (end - start) + " nanoseconds");
    }
}