package oops;

public class instance {

    int i = 0;
    {
        m1();
        System.out.println("parent instanc block");
    }

    instance() {
        System.out.println("constuctor");

    }

    public static void main(String[] args) {

        instance p = new instance();
        System.out.println("parent main");
    }

    public void m1() {
        System.out.println(j);
    }

    int j = 20;
}

class child extends instance {
    int x = 100;
    {
        m2();
        System.out.println("child first i b");
    }

    child() {
        System.out.println("child controlller");
    }

    public static void main(String[] args) {
        child c = new child();
        System.out.println("child main");
    }

    public void m2() {
        System.out.println(y);

    }

    {
        System.out.println("child second indstance");

    }
    int y = 200;
}