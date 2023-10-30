package Threading_pro;

import java.util.concurrent.*;

class PrintJob implements Runnable {
    String name;

    PrintJob(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(name + "job started by thread :" + Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
        System.out.println(name + "job completed bt thread :" + Thread.currentThread().getName());
    }
}

public class ExcutorDemo {
    public static void main(String[] args) {
        PrintJob[] jobs = { new PrintJob("dipens"),
                new PrintJob("dipen"),
                new PrintJob("dipe"),
                new PrintJob("dip"),
                new PrintJob("di"),
                new PrintJob("d") };
        ExecutorService service = Executors.newFixedThreadPool(3);
        for (PrintJob j : jobs) {
            service.submit(j);

        }
        service.shutdown();
    }
}
