package oops;

interface tst{
    void print();
}
public class lambda {
        public static void main(String[] args) {
        full(()->System.out.println("hello"));
    }
    
    static void full(tst t){
        t.print();
    }

}
