package Threading_pro;
class Mythreaddd extends Thread{
    public void run(){
        for (int i=0;i<10; i++){
            System.out.println("seeta thread");
            try{Thread.sleep(0000);}
            catch(InterruptedException e){
                
            }
        }
    }
}

public class yield_pro{
    public static void main(String[] args) throws InterruptedException {
        Mythreaddd t3 = new Mythreaddd();
        t3.start();
        t3.join(2000);
                for (int i=0;i<10; i++){
            System.out.println("main thread");
        }
    }
}
