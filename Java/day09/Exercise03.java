package Java.day09;
class student{

    String name;
    int age;
}
public class Exercise03 {
    public static void main(String[] args) {
        student student1 = new student();
        student1.name="Manohar";
        student1.age=24;
        System.out.println(student1.name);
        System.out.println(student1.age);

        student student2 = new student();
        student2.name="Rahul";

        student2.age=22;
        System.out.println(student2.name);
        System.out.println(student2.age);
    }
}
