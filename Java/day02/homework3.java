package Java.day02;
import java.util.Scanner;

public class homework3 {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter number of eggs");
        int egg=sc.nextInt();
        System.out.println("enter the price of egg");
        double price=sc.nextDouble();

       double cost = egg*price;
        System.out.println(cost);

    }
}
