package oops;

public class overloaded {
    public static void main(String[] args) {

        test t = new test();
        t.m1();
        t.m1(21);
        t.m1(12.3);
    }

}

class test {

    public void m1() {
        System.out.println("no-arg");

    }

    public void m1(int i) {
        System.out.println(" 1 arg");
    }

    public void m1(double d) {

        System.out.println("d rg");
    }

}
