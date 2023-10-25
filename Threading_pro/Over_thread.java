package Threading_pro;

class MyThreadd extends Thread{




    
    public void start(){System.out.println("no arg run");}
    public void run(){System.out.println(" arg run");}

}
public class Over_thread {
 public static void main(String[] args) {
    MyThreadd t1 =new MyThreadd();
    t1.start();
    System.out.println("main thread");
    
 }   
}
