package String_Methods;

import java.util.Scanner;
/*
Write a program that will print out first character of the word.

GOOD


 */
public class Print_firstCharacter_063 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter the word: ");
        String word=scanner.next();
         char chr=word.charAt(0);
        System.out.println(chr);

    }
}
