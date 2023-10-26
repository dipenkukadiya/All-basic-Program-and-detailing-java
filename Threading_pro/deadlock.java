package Threading_pro;

class Mythreadddd extends Thread {
    static Thread mt;

    public void run() {

        try {
            // mt.join();
            mt. sleep(10000);;
        } 
        catch (InterruptedException e) {}
            for (int i = 0; i < 10; i++) {
                System.out.println("seeta thread");

            }
        
    }
}

public class deadlock {
    public static void main(String[] args) throws InterruptedException {
        Mythreadddd.mt = Thread.currentThread();
        Mythreadddd t4 = new Mythreadddd();
        t4.start();
        t4.sleep(5000);

        for (int i = 0; i < 10; i++) {
            System.out.println("main thread");
        }
    }
}
