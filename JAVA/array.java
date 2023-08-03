import java.util.*;
public class array {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the size of array:");
     int size=sc.nextInt();
     int numbers[]=new int[size];

     for(int i=0;i<size;i++){
        System.out.print("ENter array elements:");
        numbers[i]=sc.nextInt();
     }
     System.out.print("Enter the number to be found:");
     int x=sc.nextInt();
     sc.close();
      
     for(int i=0;i<numbers.length;i++){
        if(numbers[i]==x){
            System.out.println("the number is at index:" +i);
        }
     }
    }
}
