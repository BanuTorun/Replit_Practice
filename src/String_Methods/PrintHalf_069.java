package String_Methods;

import java.util.Scanner;

/*
Write a program that will print out first half of the word twice.

Example:

input: java
output: jaja
 */
public class PrintHalf_069 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a word");
        String word=scanner.next();


        String halfWord=word.substring(0,word.length()/2);
        System.out.println(halfWord+halfWord);

        String str=word.substring(word.length()/2);
        System.out.println(str+str);

    }
}
