package Java.day11;


class Student {

    private int age;

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }
}

public class exercise05 {

    public static void main(String[] args) {

        Student s = new Student();

        s.setAge(30);
        s.setAge(40);
        s.setAge(-5);

        System.out.println(s.getAge());

    }
}