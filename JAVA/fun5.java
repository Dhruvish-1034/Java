import java.util.*;
public class fun5 {
    public static void prime(int n){ 
     boolean isprime=true;
     for(int i=2;i<n;i++){
        if(n%i==0){
            isprime=false;
        }
     }
     if(isprime){
        if(n==1){
            System.out.println("the number is not a prime no.");
            return;
        }else{
            System.out.println("it is a prime number");
            return;
        }
     }
     else{
        System.out.println("it is not  a prime number");
     }
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
     prime(n);
    sc.close(); 
    }
}
