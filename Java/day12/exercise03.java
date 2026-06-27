package Java.day12;
class employee{
    void login(){
        System.out.println("employee login");
    }
}
class Developer extends employee{
    void code(){
        System.out.println("writing java code");
    }
}
public class exercise03 {
        public static void main(String[] args) {
            Developer d1=new Developer();
            d1.login();
            d1.code();
        }
}
