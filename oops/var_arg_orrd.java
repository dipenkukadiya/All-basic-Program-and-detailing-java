package oops;

public class var_arg_orrd {
        public static void main(String[] args) {
            p p1= new p();
            p1.m1(10);
            c c1 = new c();
            c1.m1(10);
            p p2 = new c();
            p2.m1(10);
        }    
}
class p{
    public void m1(int... x){
        System.out.println("parent"+ x);
    }
}
class c extends p{
    public void m1(int x){
        System.out.println("child"+ x);
    }
}



//is it overloaded not override coz diffrent datatype