package Threading_pro;

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("CT");
        }
    }
}

class threading_first {
    public static void main(String[] args) {

        MyThread t = new MyThread();
        t.run();
        for (int i = 0; i < 10; i++) {
            System.out.println("M_T");
        }
    }

}