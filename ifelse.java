import java.util.*;

public class ifelse{
    public static void main(String args[])
    {
        // int age=22;
        // if(age >=18){
        //     System.out.println("adult");
        // }
        // else{
        //     System.out.println("not adult");
        // }
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num % 2==0){
            System.out.println("even no");

        }
        else{
            System.out.println("odd no");
        }
    }
}