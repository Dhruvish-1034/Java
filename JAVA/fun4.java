import java.util.*;
public class fun4 {
    public static int facto(int num){
        if(num<0){
            System.out.println("Invalid Input");
            return num;
        }
        int res=1;
        for(int i=num;i>=1;i--){
        res=res*i;
      }
      return res;  
    }
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int num=sc.nextInt();
     int res=facto(num);
     System.out.println(res);
     sc.close();   
    }
}
