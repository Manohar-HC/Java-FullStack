package Java.day10;
class Student{

    String name;
    int age;

    Student(String n,int a){

        name=n;
        age=a;

    }

}
public class exercise01 {
    public static void main(String[] args) {
        Student s1=new Student("Manohar",24);
        System.out.println(s1.name);
        System.out.println(s1.age);

    }
}
