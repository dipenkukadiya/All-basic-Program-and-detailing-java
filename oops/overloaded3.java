package oops;

public class overloaded3{
     public static void main(String[] args) {
        test t  =  new test();
        t.m1();
        t.m1(10,20);
        t.m1(102);
       
     }

}
class test{
    public void m1(int x){
        System.out.println("genres method");
    }
    public void m1(int... x){
        System.out.println("new version");

    }
    public void m1(StringBuffer sb){
        System.out.println("StringBuffer");
    }



}


//genres method has least priority when calling