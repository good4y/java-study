package practise.string;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class ConcurrentTest {
    public static void main(String[] args) throws InterruptedException {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();

        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable bufferTask = () -> {
            for (int i = 0; i < 10000; i++) {
                stringBuffer.append("H");
            }
        };

        Runnable builderTask = () -> {
            for (int i = 0; i < 10000; i++) {
                stringBuilder.append("H");
            }
        };

        executor.submit(bufferTask);
        executor.submit(bufferTask);
        executor.submit(builderTask);
        executor.submit(builderTask);

        executor.shutdown();
        executor.awaitTermination(10, TimeUnit.SECONDS);

        System.out.println("StringBuilder: " + stringBuilder.length());
        System.out.println("StringBuffer: " + stringBuffer.length());
    }
}
