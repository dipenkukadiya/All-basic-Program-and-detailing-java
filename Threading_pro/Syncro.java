package Threading_pro;

public class Syncro {

    public static void main(String[] args) throws InterruptedException {
    ThreadA b = new ThreadA();
    b.start();
    b.join();
    System.out.println(b.total);
    }
    
}
class ThreadA extends Thread{
    int total =0;
    public void run(){
        for(int i=1;i<=100; i++){
            total=total+i;
        }

    this.notifyAll();
    this.notify();

    
     }
}
