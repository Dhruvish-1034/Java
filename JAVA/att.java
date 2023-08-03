import java.util.*;
public class att {
    public static void main(String[] args) {
        // int marks[]=new int[3];
        //  marks[0]=91;
        // marks[1]=89;
        //  marks[2]=88;
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int numbers[]=new int[size];
        //input
        for(int i=0;i<size;i++){
           numbers[i]=sc.nextInt();
        }
        //output
        sc.close();
        for(int i=0;i<3;i++){
            System.out.println(numbers[i]);
        }
    }
}
