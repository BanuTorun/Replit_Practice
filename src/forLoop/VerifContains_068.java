package forLoop;
/*
Write a program that will verify if word contains in the sentence.
Print out the result as boolean value.

 */ import java.util.Scanner;
public class VerifContains_068 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String word = scan.nextLine();
            String sentence = scan.nextLine();
            boolean a =sentence.contains(word);


            if(a==true){
                System.out.println("true");
            }else{
                System.out.println("false");
            }

        }
    }

