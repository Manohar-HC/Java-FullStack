package Java.day04;
import java.util.Scanner;
public class Calculator {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the first number");
        int a =sc.nextInt();
        System.out.println("enter the second number");
        int b = sc.nextInt();
        System.out.println("choice");
        int c = sc.nextInt();

        switch(c){
            case 1: System.out.println(a+b);
            break;
            case 2: System.out.println(a-b);
            break;
            case 3: System.out.println(a*b);
            break;

            case 4: System.out.println(a/b);
            break;
            default: System.out.println("invalid choice");

        }
    }
}
/* Improvement

For division:

int a = 10;
int b = 3;

System.out.println(a/b);

Output:

3

Not:

3.333

Because int division removes decimals.

For accurate division:

double result = (double)a / b;
System.out.println(result);

Output:

3.333333*/
