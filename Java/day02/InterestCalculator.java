package Java.day02;
import java.util.Scanner;
public class InterestCalculator {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("principle");
        Double p=sc.nextDouble();
        System.out.println("Rate");
        Double R=sc.nextDouble();
        System.out.println("Time");
        Double T=sc.nextDouble();

        Double si=(p*R*T)/100;
        System.out.println("interst is"+si);

    }
}
/*  Common Beginner Errors
Error 1
Scanner sc = new Scanner(System.in);

without import.

Fix:

import java.util.Scanner;
Error 2
int age = sc.nextLine();

Wrong ❌

Use:

int age = sc.nextInt();*/