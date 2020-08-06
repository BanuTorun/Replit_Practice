package String_Methods;
/*
Write a program that will output length of the text (string).

Example:
Display message: "Please enter the text:"
input: java
Display message: "Length is: 4"
 */
import java.util.Scanner;

public class Find_Lenght_062 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        System.out.println("Please enter the text:");
        String text=scanner.next();

        int l=text.length();
        System.out.println("Lenght is: "+ l);

    }
}
