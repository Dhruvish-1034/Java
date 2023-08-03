import java.util.*;
public class fun7 {
    public static void table(int n){
        for(int i=1;i<=10;i++){ 
            int mul=n*i;
            System.out.println(n+"*"+i+"="+mul);
        }
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number you want table of: ");
    int n=sc.nextInt();
    table(n);
    sc.close();
    }
}
