package inner_class_object;

interface Outer{
    public void m1();
        interface inner{
        public void m2();
        
    }
}
class testy implements Outer{
    public void m1(){
        System.out.println("outer method");
    }
}
class testyy implements Outer.inner{
    public void m2(){
        System.out.println("inner cll");
    }
}
public class Inner_interface {
        public static void main(String[] args) {
            testy t1 = new testy();
            t1.m1();
            testyy t2 = new testyy();
            t2.m2();
        }    
}
