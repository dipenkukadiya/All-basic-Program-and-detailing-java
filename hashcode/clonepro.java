package hashcode;

public class clonepro implements Cloneable{
    
    int i = 10;
    int j =20;
    public static void main(String[] args) throws CloneNotSupportedException {
        clonepro c = new clonepro();
        clonepro c1 = (clonepro) c.clone();
        c1.i =888;
        c1.j = 999;
        System.out.println(c1.i+""+c1.j);
    }

}
