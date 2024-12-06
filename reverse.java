import java.util.*;
class reverse{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++){
        int n=s.nextInt();
        int r=0;
        while(n>0)
        {
           int dig=n%10;
           r=r*10+dig;
           n/=10;
        }
        System.out.println(r);
        }
    }
}