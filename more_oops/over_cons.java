package more_oops;

public class over_cons {
    
    over_cons(){
        this(10);
        System.out.println("no arg");
    }
    over_cons(int i)
    {
        this(10.2);
        System.out.println("int -arg");
    }
    over_cons(double d){
        System.out.println("double arg");
    }

    public static void main(String[] args) {
        over_cons o1 = new over_cons();
        over_cons o2 = new over_cons(10);
        over_cons o3 = new over_cons(10.5);
        over_cons o4 = new over_cons(10l);
 
    }


}
