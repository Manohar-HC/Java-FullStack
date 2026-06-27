package Java.day11;

class Employee {

    private String name;
    private int salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}

public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee();

        e1.setName("Manohar");
        e1.setSalary(34000);

        System.out.println(e1.getName());
        System.out.println(e1.getSalary());

    }
}
