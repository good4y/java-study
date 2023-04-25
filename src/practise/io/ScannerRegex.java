package practise.io;

import java.util.Scanner;

public class ScannerRegex {
    public static void main(String[] args) {
        String text = "kim: kim.yc@example.com, lee: lee.yc@example.org";
        String emailRegex = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b";

        long start;
        long end;

        start = System.currentTimeMillis();

        try (Scanner scanner = new Scanner(text)) {
            scanner.useDelimiter("[,\\s]+");
            while (scanner.hasNext()) {
                String token = scanner.next();
                if (token.matches(emailRegex)) {
                    System.out.println("찾은 메일: " + token);
                }
            }
            end = System.currentTimeMillis();
            System.out.println("timestamp: " + (end - start) + " milliseconds");
        }

        Scanner scanner = new Scanner("123, 45.6, true");
        scanner.useDelimiter(", ");
        int intValue = scanner.nextInt();
        double doubleValue = scanner.nextDouble();
        boolean boolValue = scanner.nextBoolean();

        System.out.println(intValue+ " " + doubleValue+ " " + boolValue);
    }
}
