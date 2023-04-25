package practise.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class LogFileGenerator {

    // 로그인 한 사용자의 기록
    public static void main(String[] args) {
        String[] usernames = {"kim", "lee", "hwang", "jo", "park"};
        String[] actions = {"LOGIN", "DOWNLOAD", "UPLOAD"};

        LocalDateTime startDate = LocalDateTime.of(2023, 4, 1, 0, 0);
        LocalDateTime endDate = LocalDateTime.of(2023, 4, 30, 23, 59);

        int numberOfEntries = 1_000_000;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/basic/io/logfile.txt"))) {
            Random random = new Random();

            for (int i = 0; i < numberOfEntries; i++) {
                LocalDateTime timestamp = randomDateInRange(startDate, endDate, random);
                String username = usernames[random.nextInt(usernames.length)];
                String action = actions[random.nextInt(actions.length)];
                double value = random.nextDouble() * 100;

                writer.write(String.format("%s %s %s %.1f%n", timestamp, username, action, value));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static LocalDateTime randomDateInRange(LocalDateTime startDate, LocalDateTime endDate, Random random) {
        long secondsBetween = ChronoUnit.SECONDS.between(startDate, endDate);
        long randomSeconds = Math.abs(random.nextLong()) % secondsBetween;

        return startDate.plusSeconds(randomSeconds);
    }
}
