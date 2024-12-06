import java.util.*;
class palin{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++){
        int n=s.nextInt(); 
        int temp=n;
        int r=0;         
        while(n>0)
        {
           int dig=n%10;
            n=n/10;
           r=r*10+dig;
          
        }
        System.out.println(r);
        if(temp==r){
        System.out.println("given number is a palindrome");
        }
        else{
        System.out.println("not a palindrome");
        }
    }
}
}