package oops;

public class override {
    public static void main(String[] args) {

        c c1 = new c();
        c1.marry();
        p p1 = new p();
        p1.marry();
        p1.property();;
        p p2 = new c();
        p2.marry();

    }

}

class p {
    public void property() {

        System.out.println("cash land gold");
    }

    public void marry() {

        System.out.println("girl");
    }

}

class c extends p {
    public void marry() {
        System.out.println("girl2");
    }
}
