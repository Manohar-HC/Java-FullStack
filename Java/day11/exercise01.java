package Java.day11;
class students{
   private String name;
   private int age;

public void setname(String name){
    this.name=name;
}


public void setage(int age){
    this.age=age;
}

public String getname(){
    return name;
}
public int getage(){
    return age;

}
}




public class exercise01 {
    public static void main(String[] args) {

        students s1=new students();


        s1.setname("manohar");
        s1.setage(24);
        System.out.println(s1.getname());
        System.out.println(s1.getage());
    }

}
