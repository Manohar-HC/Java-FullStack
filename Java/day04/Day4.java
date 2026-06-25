package Java.day04;

public class Day4 {
    /*
    DAY 4 - SWITCH STATEMENT (ELI10)

Imagine ATM menu:

1. Check Balance
2. Withdraw
3. Deposit
4. Exit

If user presses:

1

Show balance.

If:

2

Withdraw.

Instead of many if-else, we use switch.
    Syntax
switch(choice)
{
    case 1:
        System.out.println("Balance");
        break;

    case 2:
        System.out.println("Withdraw");
        break;

    default:
        System.out.println("Invalid Choice");
}
Example
int day = 1;

switch(day)
{
    case 1:
        System.out.println("Monday");
        break;

    case 2:
        System.out.println("Tuesday");
        break;

    default:
        System.out.println("Invalid");
}

Output:

Monday
What is break?

Without break:

case 1:
System.out.println("Monday");

case 2:
System.out.println("Tuesday");

Output:

Monday
Tuesday

😱 Wrong

So use:

break;

to stop execution.

Mini Example
int choice = 3;

switch(choice)
{
    case 1:
        System.out.println("Pizza");
        break;

    case 2:
        System.out.println("Burger");
        break;

    case 3:
        System.out.println("Dosa");
        break;

    default:
        System.out.println("Invalid");
}

Output:

Dosa
Homework
HW1

Take number:

1 → Monday
2 → Tuesday
3 → Wednesday
4 → Thursday
5 → Friday
6 → Saturday
7 → Sunday

Use switch.

HW2

Calculator

Input:

First Number
Second Number
Choice

1 = +
2 = -
3 = *
4 = /

Example:

10
5
1

Output:

15
HW3

Food Menu

1 = Idli
2 = Dosa
3 = Biryani
4 = Coffee

Use switch.

Challenge

Predict output:

int x = 2;

switch(x)
{
    case 1:
        System.out.println("A");
        break;

    case 2:
        System.out.println("B");
        break;

    case 3:
        System.out.println("C");
        break;
}

Output = ? */


}
