package Java.day06;

public class Arrays {
    /* DAY 6 - ARRAYS (ELI10)
Problem

Suppose you want to store marks.

Without array:

int mark1 = 80;
int mark2 = 75;
int mark3 = 90;
int mark4 = 60;
int mark5 = 85;

😵 Too many variables.

What if 100 students?

What is an Array?

Think of an apartment.

Room 0 = 80
Room 1 = 75
Room 2 = 90
Room 3 = 60
Room 4 = 85

One building = Array

Rooms = Indexes

Values = Data

Creating an Array
int[] marks = {80, 75, 90, 60, 85};

Break it down:

int[]

means array of integers.

marks

array name.

{80,75,90,60,85}

data stored inside.

Index

Java starts counting from 0, not 1.

Index    Value

0        80
1        75
2        90
3        60
4        85
Accessing Values
int[] marks = {80,75,90,60,85};

System.out.println(marks[0]);

Output:

80
System.out.println(marks[2]);

Output:

90
Length

How many elements?

marks.length

Example:

int[] marks = {80,75,90,60,85};

System.out.println(marks.length);

Output:

5
Changing Value
int[] marks = {80,75,90};

marks[1] = 100;

Now:

80
100
90
Print Entire Array Using Loop
int[] marks = {80,75,90,60,85};

for(int i = 0; i < marks.length; i++)
{
    System.out.println(marks[i]);
}

Output:

80
75
90
60
85
How This Works

First round:

i = 0

Print:

marks[0]

80

Second round:

i = 1

Print:

marks[1]

75

Keeps going until end.

Real Example - Total Marks
int[] marks = {80,75,90};

int total = 0;

for(int i = 0; i < marks.length; i++)
{
    total = total + marks[i];
}

System.out.println(total);

Output:

245
Real Example - Find Largest Number
int[] numbers = {10,50,30,70,20};

int largest = numbers[0];

for(int i = 0; i < numbers.length; i++)
{
    if(numbers[i] > largest)
    {
        largest = numbers[i];
    }
}

System.out.println(largest);

Output:

70
Common Mistake ❌
System.out.println(marks[5]);

If array has:

int[] marks = {80,75,90,60,85};

Indexes are:

0 1 2 3 4

No index 5 exists.

Error:

ArrayIndexOutOfBoundsException
Homework
HW1

Create:

int[] numbers = {10,20,30,40,50};

Print all values using loop.

HW2

Create:

int[] numbers = {5,10,15,20,25};

Find total sum.

Expected:

75
HW3

Create:

int[] numbers = {10,40,25,80,15};

Find largest number.

Expected:

80
Challenge

Predict output:

int[] arr = {5,10,15};

System.out.println(arr[1]);

Output = ?




Code:

int[] numbers = {10,50,30,70,20};

int largest = numbers[0];

for(int i = 0; i < numbers.length; i++)
{
    if(numbers[i] > largest)
    {
        largest = numbers[i];
    }
}

System.out.println(largest);
Line 1
int[] numbers = {10,50,30,70,20};
int

Means:

Whole numbers

Examples:

10
20
30
[]

Means:

Array

Multiple values stored together.

numbers

Variable name.

You can write:

marks
ages
salary

Anything.

=

Means:

Assign
Store
{10,50,30,70,20}

Data stored in array.

Memory looks like:

Index   Value

0       10
1       50
2       30
3       70
4       20
Line 2
int largest = numbers[0];
Why?

We need a starting value.

Java cannot compare with nothing.

So we assume:

Largest = First element
numbers[0]

Index 0 means:

10

So:

int largest = 10;

Memory:

largest = 10
Line 3
for(int i = 0; i < numbers.length; i++)

Let's break every part.

for

Means:

Repeat
Repeat
Repeat
int i = 0

Create variable:

i = 0

Why 0?

Array starts from:

0
1
2
3
4

Not:

1
2
3
4
5
i < numbers.length

What is:

numbers.length

Array has:

10
50
30
70
20

Total:

5 elements

So:

numbers.length

becomes:

5

Condition becomes:

i < 5
i++

Means:

i = i + 1

Increase by 1.

First Round
i = 0

Check:

if(numbers[i] > largest)

becomes:

if(numbers[0] > 10)

becomes:

if(10 > 10)

Result:

false

Nothing happens.

largest still:

10
Second Round
i = 1

Check:

if(numbers[1] > largest)

numbers[1]:

50

largest:

10

Condition:

50 > 10

TRUE ✅

Run block:

largest = numbers[1];

becomes:

largest = 50;

Now:

largest = 50
Third Round
i = 2

numbers[2]:

30

Check:

30 > 50

FALSE ❌

largest remains:

50
Fourth Round
i = 3

numbers[3]:

70

Check:

70 > 50

TRUE ✅

Update:

largest = 70;

Now:

largest = 70
Fifth Round
i = 4

numbers[4]:

20

Check:

20 > 70

FALSE ❌

largest remains:

70
Loop Ends

Now:

i = 5

Condition:

i < 5

becomes:

5 < 5

FALSE ❌

Loop stops.

Final Line
System.out.println(largest);

Print:

70
Visual Memory Trick

Start:

largest = 10

Compare:

10 vs 10 → 10

50 vs 10 → 50

30 vs 50 → 50

70 vs 50 → 70

20 vs 70 → 70

Final winner:

70

🏆 Largest Number = 70


*/
}
