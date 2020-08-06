package String_Methods;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
write the longerst word
 */
public class PrintLongestWord_070 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first word:");
        String word1=scan.next();
        System.out.println("Enter second word:");
        String word2=scan.next();
         String str="";

        if(word1.length()>word2.length()){
            str= word1;
        }else{
            str=word2;
        }
        System.out.println(str);
    }
}
