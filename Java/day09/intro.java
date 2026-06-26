package Java.day09;

public class intro {
    /* Today is the most important day in Core Java.

DAY 9 - OOP (Object-Oriented Programming)

Goal: By the end of today, you'll understand Class and Object. We will NOT learn Inheritance or Polymorphism today. One step at a time.

First Question

Look around your room.

What do you see?

Maybe:

Laptop 💻
Phone 📱
Bottle 🍼
Chair 🪑

These are all objects.

Now ask yourself:

Who created them?

A company first designed them.

For example:

Before making an iPhone, there is a design (blueprint).

Then thousands of phones are made using that blueprint.

In Java:

Blueprint = Class

Real Phone = Object
Example 1 - Car

Imagine:

Blueprint

Car
-------------
Color
Model
Price
Start()
Stop()

This blueprint is called a Class.

Now create real cars.

Car 1

Color = Black
Model = BMW
Price = 60L
Car 2

Color = White
Model = Audi
Price = 70L
Car 3

Color = Red
Model = Ferrari
Price = 5Cr

All came from one class.

Java Code
class Car {

    String color;
    String model;

}

Question:

Did we create any car?

❌ No.

We only created the blueprint.

Creating an Object

Now we make a real car.

Car car1 = new Car();

Break it down.

Car

Class name.

Think:

Blueprint
car1

Object name.

Think:

Real Car
new

Means:

Create a new object.
Car()

Means:

Use Car blueprint.
Giving Values
car1.color = "Black";
car1.model = "BMW";

Now object contains:

Color = Black

Model = BMW
Printing
System.out.println(car1.color);

System.out.println(car1.model);

Output:

Black
BMW
Full Program
class Car {

    String color;
    String model;

}

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.color = "Black";
        car1.model = "BMW";

        System.out.println(car1.color);
        System.out.println(car1.model);

    }

}
Multiple Objects
Car car1 = new Car();

Car car2 = new Car();

Now:

car1.color = "Black";

car2.color = "White";

Output:

Black

White

Same class.

Different objects.

Another Example - Student

Blueprint:

class Student {

    String name;

    int age;

}

Create Object:

Student s1 = new Student();

Assign values:

s1.name = "Manohar";

s1.age = 24;

Print:

System.out.println(s1.name);

System.out.println(s1.age);

Output:

Manohar

24
Real-Life Analogy

Suppose a cookie cutter 🍪.

The cutter is the Class.

Every cookie made from it is an Object.

One cutter.

Hundreds of cookies.

Common Beginner Mistake
Student.name = "Manohar";

❌ Wrong

Why?

Because Student is only a blueprint.

You need a real object.

Correct:

Student s1 = new Student();

s1.name = "Manohar";
Homework
HW1

Create a class:

class Mobile

Variables:

brand

price

Create object:

phone1

Store:

Samsung

50000

Print both.

HW2

Create class:

Employee

Variables:

name

salary

Create:

emp1

Store:

Manohar

34000

Print.

HW3

Create two Student objects.

Student 1

Manohar

24
Student 2

Rahul

22

Print both.

Challenge

Without running the code, tell me the output.

class Dog{

    String name;

}

public class Main{

    public static void main(String[] args){

        Dog d1 = new Dog();

        d1.name = "Tommy";

        System.out.println(d1.name);

    }

}
Today's New Words
Class = Blueprint

Object = Real Thing

new = Create Object

Reference Variable = car1, s1, phone1

. (Dot Operator) = Access variables or methods
Today's Goal

Don't think about Inheritance or Polymorphism yet.

Just remember this:

Class = Design

Object = Real Item

Once this becomes natural, the rest of OOP becomes much easier.

Complete the 3 homework programs and answer the challenge. Then we'll move to Constructors, which make object creation much cleaner. */
}
