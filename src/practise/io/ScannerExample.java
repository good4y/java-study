package practise.io;

import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;

public class ScannerExample {
    public static void main(String[] args) {
        try {
            Runtime runtime = Runtime.getRuntime();

            long initialMemory = runtime.totalMemory() - runtime.freeMemory();

            long start;
            long end;

            Scanner scanner = new Scanner(new File("src/basic/io/logfile.txt"));

            start = System.currentTimeMillis();

            while (scanner.hasNext()) {
                LocalDateTime timestamp = LocalDateTime.parse(scanner.next());
                String username = scanner.next();
                String action = scanner.next();
                double value = scanner.nextDouble();

                System.out.printf("Timestamp: %s, Username: %s, Action: %s, Value: %.1f%n", timestamp, username, action, value);
            }
            System.out.println("최초 메모리 사용량: " + initialMemory + " bytes");

            long finalMemory = runtime.totalMemory() - runtime.freeMemory();
            System.out.println("최종 메모리 사용량: " + finalMemory + " bytes");

            long memoryDifference = finalMemory - initialMemory;
            System.out.println("메모리 사용량 차이 " + memoryDifference + " bytes");

            end = System.currentTimeMillis();
            System.out.println("timestamp: " + (end - start) + " milliseconds");

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
