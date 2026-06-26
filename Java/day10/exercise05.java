package Java.day10;
class student{
    String name;
    int age;
    student(String name,int age){
        this.name=name;
        this.age=age;
    }
}

public class exercise05 {
    public static void main(String[] args) {
        student s1 = new student("manohar",24);
        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}
