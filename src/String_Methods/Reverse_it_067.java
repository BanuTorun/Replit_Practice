package String_Methods;

import java.util.Scanner;

/*
Write a program that will reverse a string.
Your program should reverse a string only 5 characters long.
If word is shorter, display message: "Too short!".
If word is longer, display message: "Too long!".
Otherwise, reverse this word and print out result into the console.

Example:
input: cat
output: Too short!

Example:
input: singularity
output: Too long!

Example:
input: apple
output: elppa

 */
public class Reverse_it_067 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String word = scan.next();


            if(word.length()>5){
                System.out.println("Too long!");
            }else if (word.length()<5){
                System.out.println("Too short!");
            }else{
                String reversed=""+word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0);

                System.out.println(reversed);
            }

        }
    }




