package forLoop;
/*
Write a program that will print out first and last letters together.

adobe
ae
 */
import java.util.Scanner;

public class PrintFirstAndLast_062 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word=scan.next();

        String str=""+word.charAt(0)+(word.substring(word.length()-1));
        System.out.println(str);


    }

}
