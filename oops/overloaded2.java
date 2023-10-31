package oops;

public class overloaded2{
     public static void main(String[] args) {
        test t  =  new test();
        t.m1(new Object());
        t.m1("dipen");
        t.m1(t);
       
     }

}
class test{
    public void m1(String st){
        System.out.println("string");
    }
    public void m1(Object o){
        System.out.println("object verison");

    }
    public void m1(StringBuffer sb){
        System.out.println("stingbuufer");
    }



}


//string and string method are both can call null object if 
// call t.m1(null) then we get compile time error like m1 is ambiguous methode