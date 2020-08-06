package String_Methods;

import java.util.Scanner;

/*
You have 2 words
Print the first word, second word, second word, first word

Input:
one
two
Output:
onetwotwoone
 */
public class Duplicate_it_065 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the word1:");
        String word1=scanner.next();
        System.out.println("Please enter the word2:");
        String word2=scanner.next();

        String fullWord=word1+word2+word2+word1;
        System.out.println(fullWord);
    }
}


