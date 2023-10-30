package Threading_pro;

public class Thread_Group {
    public static void main(String[] args) {
        ThreadGroup g1 = new ThreadGroup("fg");
        System.out.println(g1.getParent().getName());
        ThreadGroup g2 = new ThreadGroup(g1,"sg");
        System.out.println(g2.getParent().getName());

    }
}
