package String_Methods;
/*
Write a program that will print out last letter of the word (string).
 */
import java.util.Scanner;

public class Print_lastCharacter_064 {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a word:");
       String word=scanner.next();
       String chr=""+word.charAt(word.length()-1);
       chr=chr.toUpperCase();
        System.out.println(chr);
    }

}
