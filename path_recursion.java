public class path_recursion{
    public static int countpath(int i,int j,int m,int n){
        if (i == n || j== m){
            return 0;
        }
        
        if (i == n-1 && j== m-1){
            return 1;
        }
        
        
        int downpath = countpath(i+1,j,m,n);

        int rightpath = countpath(i,j+1,m,n);
        return downpath+rightpath;
    }
    public static void main(String[] args) {
        int n =3, m=3;
        int totalpath =countpath(0, 0, m, n);
        System.out.println(totalpath);        
    }
    
}
