package Java.day08;
import java.util.Scanner;
public class Exercise01 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter name");
       String name = sc.nextLine();
       if(name.equals("manohar")){
           System.out.println("welcome");
       }
       else{
           System.out.println("Access Denied");
       }

   }
}
