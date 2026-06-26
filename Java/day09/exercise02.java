package Java.day09;
class Employee{
    int salary;
    String name;
}
public class exercise02 {
    public static void main(String[] args) {
        Employee e1 =new Employee();

      e1.salary=34000;
      e1.name="Manohar";
      System.out.println(e1.salary);
      System.out.println(e1.name);
    }
}
