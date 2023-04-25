package practise.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BufferedReaderRegex {
    public static void main(String[] args) {
        String text = "kim: kim.yc@example.com, lee: lee.yc@example.org";
        String emailRegex = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b";
        Pattern emailPattern = Pattern.compile(emailRegex);

        long start;
        long end;

        start = System.currentTimeMillis();

        try (BufferedReader reader = new BufferedReader(new StringReader(text))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split("[,\\s]+");
                for (String token : tokens) {
                    Matcher matcher = emailPattern.matcher(token);
                    if (matcher.matches()) {
                        System.out.println("찾은 메일: " + token);
                    }
                }
            }
            end = System.currentTimeMillis();

            System.out.println("timestamp: " + (end - start) + " milliseconds");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
