package Java.day07;

public class MethodFunction {
    /* DAY 7 - METHODS (Functions)
    Problem

Without methods:

System.out.println(10 + 20);
System.out.println(50 + 30);
System.out.println(100 + 200);

Repeating logic.

Methods let us write once, use many times.

What is a Method?

Think of a mixer grinder.

Input:

Mango
Milk
Sugar

Press button.

Output:

Mango Shake

Method works similarly.

Input → Process → Output

Simple Method
public class Demo {

    static void greet()
    {
        System.out.println("Hello Manohar");
    }

    public static void main(String[] args)
    {
        greet();
    }
}

Output:

Hello Manohar
Breaking It Down
static void greet()
static

Allows calling method directly.

void

Returns nothing.

greet

Method name.

Calling Method
greet();

This executes the method.

Method with Parameters
static void greet(String name)
{
    System.out.println("Hello " + name);
}

Call:

greet("Manohar");
greet("Ravi");

Output:

Hello Manohar
Hello Ravi
Method with Two Numbers
static void add(int a, int b)
{
    System.out.println(a + b);
}

Call:

add(10,20);
add(50,30);

Output:

30
80
Return Keyword

Sometimes method gives value back.

static int add(int a, int b)
{
    return a + b;
}

Use:

int result = add(10,20);

System.out.println(result);

Output:

30
Why Return?

Without return:

add(10,20);

Just prints.

With return:

int x = add(10,20);

Stores result.

Much more powerful.

Homework
HW1

Create method:

static void welcome()

Print:

Welcome Manohar

Call it from main.

HW2

Create method:

static void square(int n)

Print square.

Example:

square(5);

Output:

25
HW3

Create method:

static int add(int a,int b)

Return sum.

Print result in main.

Challenge

Predict output:

static void hello()
{
    System.out.println("Java");
}

public static void main(String[] args)
{
    hello();
    hello();
}

Output = ?





Real Life Example

Soch tere ghar mein ek TV Remote hai.

Remote pe ek button hai:

Power Button

Jab tu Power button dabata hai,

➡️ TV ON ho jata hai.

Har baar TV on karne ke liye andar ka circuit nahi likhta.

Bas button dabata hai.

👉 Method = Button

Java mein bhi same hai.

Instead of writing:

System.out.println("Welcome Manohar");
System.out.println("Welcome Manohar");
System.out.println("Welcome Manohar");

Hum ek method bana dete hain.

static void welcome() {
    System.out.println("Welcome Manohar");
}

Ye sirf button banaya hai.

Abhi kuch print nahi hoga.

Method ko chalana padta hai.
public static void main(String[] args) {

    welcome();

}

Ye line:

welcome();

Method ko call karti hai.

Ab output:

Welcome Manohar
Agar 3 baar call kare?
public static void main(String[] args) {

    welcome();
    welcome();
    welcome();

}

Output:

Welcome Manohar
Welcome Manohar
Welcome Manohar

Method ek machine ki tarah hai.

Call karoge tabhi chalega.

Method with Input (Parameter)

Suppose welcome sirf Manohar ko nahi, kisi ko bhi bolna hai.

static void welcome(String name) {

    System.out.println("Welcome " + name);

}

Ab call:

welcome("Manohar");
welcome("Rahul");
welcome("Ravi");

Output:

Welcome Manohar
Welcome Rahul
Welcome Ravi
Isme kya hua?

Method ne input liya.

Input ka naam hai:

String name

Uske andar:

"Manohar"

gaya.

Another Example

Without method:

System.out.println(10 + 20);
System.out.println(50 + 30);
System.out.println(100 + 200);

Method:

static void add(int a, int b) {

    System.out.println(a + b);

}

Call:

add(10,20);
add(50,30);
add(100,200);

Output:

30
80
300
Return

Ab maan le teacher poochta hai:

2 + 3 kitna?

Tu bolta hai:

5

Ye answer wapas dena hi return hai.

Example:

static int add(int a, int b) {

    return a + b;

}

Main method:

int result = add(10,20);

System.out.println(result);

Output:

30

Difference:

Without return
static void add(int a, int b) {
    System.out.println(a + b);
}

Ye sirf print karta hai.

With return
static int add(int a, int b) {
    return a + b;
}

Ye value wapas deta hai.

Us value ko variable mein store kar sakte ho.

Easy Formula
Method = Ek kaam karne wali machine

Call = Machine ko start karna

Parameter = Machine ko input dena

Return = Machine ka output wapas lena*/
}
