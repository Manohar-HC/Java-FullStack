package Java.day12;


class Employe{
    void work(){
        System.out.println("Employee working");
    }

    }
class developer extends Employe{
    void work(){
        System.out.println("Developer writing code");
    }
}
public class methodoveridden03 {
    public static void main(String[] args) {
      developer d = new developer();
      d.work();
    }
}