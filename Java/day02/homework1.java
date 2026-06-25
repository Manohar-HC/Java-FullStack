package Java.day02;
import java.util.Scanner;

public class homework1 {
    public static void main (String[]args){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
        String name=sc.nextLine();


        System.out.println("enter your age");
        int age=sc.nextInt();


        System.out.println("enter your city");
        String city=sc.next();



        System.out.println("hello"+name);
        System.out.println("Age:"+age);
        System.out.println("City:"+city);
    }
}
