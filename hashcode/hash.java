package hashcode;

public class hash {
    
    int i;
    hash(int i){
        this.i=i;
    }
    public String toString(){
        return i+"";
    }
    public int hashcode(){
        return i;

    }
    public static void main(String[] args) {
        hash h = new hash(20);
        hash h1 = new hash(200);
        System.out.println(h);
        System.out.println(h1);
    }
}