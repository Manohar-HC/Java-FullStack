package Java.day10;

public class thiskeyword {
    /* Now...

Today we'll learn something that confuses almost every Java beginner.

this Keyword

Don't worry.

By the end you'll say

"Ohhh... that's all?"

😂

Problem

Look at this constructor.

class Student{

    String name;

    int age;

    Student(String n,int a){

        name=n;
        age=a;

    }

}

Works perfectly.

But imagine company coding standards.

Manager says:

Parameter name should also be name.

So we write:

Student(String name,int age)

Now code becomes

Student(String name,int age){

    name=name;

    age=age;

}

Question...

Which name?

Left one?

Right one?

😂 Java also gets confused.

Imagine Real Life

You and your friend both are named

Manohar

Teacher says

Manohar stand up.

Who stands?

😂

Confusing.

Java's Solution

Java says

Current object's variable = this

Instead of

name=name;

Write

this.name=name;

Read it like English:

this.name

↓

This object's name

Equals

Parameter name

Same

this.age=age;

Meaning

This object's age

=

Parameter age
Visual
Student(String name,int age){

    this.name=name;

    this.age=age;

}

Think

Object

↓

this

↓

Store values
Full Program
class Student{

    String name;
    int age;

    Student(String name,int age){

        this.name=name;
        this.age=age;

    }

}

public class Main{

    public static void main(String[] args){

        Student s1=new Student("Manohar",24);

        System.out.println(s1.name);
        System.out.println(s1.age);

    }

}

Output

Manohar
24

Same output.

Cleaner code.

Professional code.

Used everywhere in Spring Boot.

Easy Formula

Without this

name=n;

Different names.

No confusion.

With this

this.name=name;

Same names.

Need this.

Biggest Rule

If parameter name and variable name are different

name=n;

✅ Works.

If parameter name and variable name are same

name=name;

❌ Wrong.

Need

this.name=name;
Mini Quiz

What will this print?

class Mobile{

    String brand;

    Mobile(String brand){

        this.brand=brand;

    }

}

public class Main{

    public static void main(String[] args){

        Mobile m=new Mobile("Samsung");

        System.out.println(m.brand);

    }

}

👉 Think step by step and answer.

Homework
HW1

Rewrite your Student constructor using:

this.name = name;
this.age = age;

(No n and a.)

HW2

Rewrite Car using this.

HW3

Rewrite Employee using this.*/
}
