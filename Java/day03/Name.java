package Java.day03;
import java.util.Scanner;
public class Name {
    public static void main(String[]args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.nextLine();
        if (name.equals("manohar")){
            System.out.println("hello manohar");

        }
        else{
            System.out.println("invalid user name");
        }
    }

}
//Important Rule
//
//For String use:
//
//        ✅ Correct
//
//name.equals("Manohar")
//
//❌ Wrong
//
//name == "Manohar"
//
//We'll learn why later.