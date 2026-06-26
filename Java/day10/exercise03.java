package Java.day10;
class employee{
    String name;
    int salary;
    employee(String n,int s){
        name=n;
        salary=s;
    }
}
public class exercise03 {

    public static void main(String[] args) {
        employee e1=new employee("Manohar",34000);
        System.out.println(e1.name);
        System.out.println(e1.salary);
    }
}
