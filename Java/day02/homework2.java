package Java.day02;
import java.util.Scanner;

public class homework2 {
    public static void main(String[]args){

        Scanner sc=new Scanner (System.in);
        System.out.println("enter length value");
        int length=sc.nextInt();

        System.out.println("enter width value");
        int width=sc.nextInt();

       int area =length*width;
       System.out.println("Area of rectangle is"+area);
   }
}