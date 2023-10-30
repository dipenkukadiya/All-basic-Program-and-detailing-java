package Threading_pro;

public class Deadlock2 extends Thread {

    A a = new A();
    B b = new B();
    public void m1(){
        this.start();
        a.d1(b); //excuted by main thread
    }
    public void run(){
        b.d2(a);
    }


    public static void main(String[] args) {
        Deadlock2 t = new Deadlock2();
        t.m1();
    }
}

class A {
    public synchronized void d1(B b){
        System.out.println("Thread1 start execution of d1() methode");
    
    try{
        Thread.sleep(3000);
    }
    catch(InterruptedException e){}
    System.out.println("Thread1 trying to call b last methode");
    b.last();
    }

    public synchronized void last() {
        System.out.println("inside A,last methode");
    }
}
class B {
    public synchronized void d2(A a){
        System.out.println("Thread2 start execution of d2() methode");
    
    try{
        Thread.sleep(5000);
    }
    catch(InterruptedException e){}
    System.out.println("Thread1 trying to call A last methode");
    a.last();
    }

    public synchronized void last() {
        System.out.println("inside B,last methode");
    }
}