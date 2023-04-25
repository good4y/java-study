package practise.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.StringTokenizer;

public class BufferedReaderExample {
    public static void main(String[] args) {
        try {
            Runtime runtime = Runtime.getRuntime();

            long initialMemory = runtime.totalMemory() - runtime.freeMemory();

            long start;
            long end;

            BufferedReader reader = new BufferedReader(new FileReader("src/basic/io/logfile.txt"));
            String line;

            start = System.currentTimeMillis();

            while ((line = reader.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(line, " ");
                LocalDateTime timestamp = LocalDateTime.parse(tokenizer.nextToken());
                String username = tokenizer.nextToken();
                String action = tokenizer.nextToken();
                double value = Double.parseDouble(tokenizer.nextToken());

                System.out.printf("Timestamp: %s, Username: %s, Action: %s, Value: %.1f%n", timestamp, username, action, value);
            }

            System.out.println("최초 메모리 사용량: " + initialMemory + " bytes");

            long finalMemory = runtime.totalMemory() - runtime.freeMemory();
            System.out.println("최종 메모리 사용량: " + finalMemory + " bytes");

            long memoryDifference = finalMemory - initialMemory;
            System.out.println("메모리 사용량 차이: " + memoryDifference + " bytes");

            end = System.currentTimeMillis();
            System.out.println("timestamp: " + (end - start) + " milliseconds");

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}