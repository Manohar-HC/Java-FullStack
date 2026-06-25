package Java.day03;
import java.util.Scanner;
public class marksGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
       int marks = sc.nextInt();


       if(marks>=90){
           System.out.println('A');
       }
       else if(marks>=75){
           System.out.println('B');
       }
       else if(marks>=50){
           System.out.println('C');
       }
       else if (marks<50){
           System.out.println("fail");
       }
    }
}
