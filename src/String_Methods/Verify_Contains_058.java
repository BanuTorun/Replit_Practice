package String_Methods;
import java.util.Scanner;
/*
Write a program that will verify if word contains in the sentence.
Print out the result as boolean value.
 */
public class Verify_Contains_058 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();
        String result="";

        if(sentence.contains(word)){
            result="true";
        }else{
            result="false";
        }
        System.out.println(result);
    }

}
