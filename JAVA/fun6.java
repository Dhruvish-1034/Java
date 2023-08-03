import java.util.*;
public class fun6 {
    public static void evenodd(int n){
    if(n%2==0){
        System.out.println("it is an even number");
        return;
    }else{
        System.out.println("it is an odd number");
        return;
    }
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    evenodd(n);
    sc.close(); 
    }
}
