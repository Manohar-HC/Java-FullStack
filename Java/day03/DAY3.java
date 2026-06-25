package Java.day03;

public class DAY3 {


    /* DAY 3 - IF ELSE

Imagine:

You go to a movie.

Rule:

Age >= 18
→ Enter

Age < 18
→ Not Allowed

Java also makes decisions like this.

What is IF?

IF means:

If condition is true
Do something

Syntax:

if(condition)
{
   code
}
Example 1
int age = 24;

if(age >= 18)
{
    System.out.println("Adult");
}

Output:

Adult

Because:

24 >= 18

is TRUE.

Example 2
int age = 15;

if(age >= 18)
{
    System.out.println("Adult");
}

Output:

Nothing

Why?

Condition is FALSE.

Java skips the block.

IF ELSE

Sometimes we need two choices.

True → One thing

False → Another thing

Syntax:

if(condition)
{
   code
}
else
{
   code
}
Example
int age = 15;

if(age >= 18)
{
    System.out.println("Eligible");
}
else
{
    System.out.println("Not Eligible");
}

Output:

Not Eligible
Real Example - Voting
import java.util.Scanner;

public class Voting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Age");

        int age = sc.nextInt();

        if(age >= 18)
        {
            System.out.println("You can vote");
        }
        else
        {
            System.out.println("You cannot vote");
        }
    }
}
ELSE IF

When there are many conditions.

Example:

Marks

90+  = A

75+  = B

50+  = C

Below = Fail
int marks = 82;

if(marks >= 90)
{
   System.out.println("A");
}
else if(marks >= 75)
{
   System.out.println("B");
}
else if(marks >= 50)
{
   System.out.println("C");
}
else
{
   System.out.println("Fail");
}

Output:

B
ATM Example
int balance = 5000;
int withdraw = 3000;

if(withdraw <= balance)
{
    System.out.println("Withdrawal Successful");
}
else
{
    System.out.println("Insufficient Balance");
}

Output:

Withdrawal Successful
Login Example
String password = "java123";

if(password.equals("java123"))
{
    System.out.println("Login Success");
}
else
{
    System.out.println("Wrong Password");
}
Important Rule

For String use:

✅ Correct

name.equals("Manohar")

❌ Wrong

name == "Manohar"

We'll learn why later.

Logical Operators
AND (&&)

Both conditions must be true.

age >=18 && age <=60

Example:

25 >=18
AND
25 <=60

Output:

true
OR (||)

Any one condition true.

age <18 || age >60

Example:

15 <18

Output:

true
Homework
HW1

Take age from user.

If age >= 18

Print:

Eligible For Vote

Else:

Not Eligible For Vote
HW2

Take marks.

90+ = A

75+ = B

50+ = C

Below = Fail

Use else-if.

HW3

Take balance and withdraw amount.

Print:

Withdrawal Successful

or

Insufficient Balance
HW4 (Challenge)

Take username.

If username is:

Manohar

Print:

Welcome Manohar

Else:

Unknown User

(Hint: Use .equals())*/
}
