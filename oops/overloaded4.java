package oops;

public class overloaded4{
     public static void main(String[] args) {
        test t  =  new test();
        animal a = new animal();
        t.m1(a);
        monkey m = new monkey();
        t.m1(m);
        animal a1 = new monkey();
        t.m1(a1); 
      
     }

}
class animal{
}
class monkey extends animal{
}
class test{

    public void m1(animal a){
        System.out.println("animal version");
    }
    public void m1(monkey m){
        System.out.println("monkey version");

    }

}


//string and string method are both can call null object if 
// call t.m1(null) then we get compile time error like m1 is ambiguous methode