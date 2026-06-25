package Java.day08;

public class stringbasic {
    /* DAY 8 - STRINGS (ELI10)

Today we'll learn one of the most asked interview topics.

What is a String?

A String is simply text.

Example:

String name = "Manohar";

Here:

String

= Data type

name

= Variable name

"Manohar"

= Value

String Methods

Suppose:

String name = "Manohar";
1. length()

Counts characters.

System.out.println(name.length());

Output:

8

Because:

M a n o h a r
1 2 3 4 5 6 7 8
2. toUpperCase()
System.out.println(name.toUpperCase());

Output:

MANOHAR
3. toLowerCase()
System.out.println(name.toLowerCase());

Output:

manohar
4. charAt()

Gets one character.

System.out.println(name.charAt(0));

Output:

M
System.out.println(name.charAt(3));

Output:

o

Remember:

M a n o h a r
0 1 2 3 4 5 6 7

Indexes start from 0.

5. equals()
String password = "java";

System.out.println(password.equals("java"));

Output:

true
6. contains()
String sentence = "I Love Java";

System.out.println(sentence.contains("Java"));

Output:

true*/
}
