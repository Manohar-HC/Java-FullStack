package Java.day02;
import java.util.Scanner;
public class scannerclass {
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in); //scanner object
       System.out.println("enter your name");
       String name=sc.nextLine();
       System.out.println("hello my name is"+name);

    }
}
/*DAY 2 - USER INPUT (Scanner) ELI10

Until now:

String name = "Manohar";

You manually gave the value.

What if user enters:

Manohar

from keyboard?

For that we use Scanner.

What is Scanner?

Imagine:

Keyboard --> Scanner --> Java Program

Scanner listens to keyboard input.

Java receives the value.

Step 1: Import Scanner
import java.util.Scanner;

Meaning:

"Java, I want to use Scanner tool."

Step 2: Create Scanner Object
Scanner sc = new Scanner(System.in);

Let's break it down.

Scanner

This is the blueprint/class.

Think:

Car = Class
BMW = Object

Similarly:

Scanner = Class
sc = Object
sc

Variable name.

You can write:

Scanner input = new Scanner(System.in);

or

Scanner keyboard = new Scanner(System.in);

Most developers use:

Scanner sc
new

Means:

Create a new object
System.in

Means:

Take input from keyboard
Full Program
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name:");

        String name = sc.nextLine();

        System.out.println("Hello " + name);

    }
}
Execution

Program asks:

Enter Name:

User types:

Manohar

Output:

Hello Manohar
Input Types
String
String name = sc.nextLine();

Reads:

Manohar
Bangalore
Java Developer
int
int age = sc.nextInt();

Reads:

24
50
100
double
double salary = sc.nextDouble();

Reads:

34000.50
boolean
boolean pass = sc.nextBoolean();

Reads:

true
false */