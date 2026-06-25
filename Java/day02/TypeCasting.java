package Java.day02;
import java.util.Scanner;
public class TypeCasting {

  public static void main (String[]args){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter your year of birth");
      int birthyear = sc.nextInt();
    int age=2026 -birthyear;
    System.out.println("my age is"+age);
  }
}



/*Type Casting

Sometimes Java converts one type to another.

        Example:

double salary = 10000;

Java converts:

        10000

to

10000.0

Automatically.

Explicit Type Casting
double num = 10.9;

int x = (int) num;

System.out.println(x);

Output:

        10

Why?

Because int cannot store decimals.

So:

        10.9

becomes:

        10

Decimal removed.*/