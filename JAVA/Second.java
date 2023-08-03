import java.util.*;
public class Second{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt(); //natural number
    int sum=0;
    for(int i=1;i<=n;i++){ //i=2,3,4
        sum=sum+i; //sum=, sum=sum+i ,1+2=3 ,3+3=6,6+4=10
    }System.out.println(sum);
    sc.close();
    }
}