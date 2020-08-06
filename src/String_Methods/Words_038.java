package String_Methods;
/*
in this assignment you are given two string variables word1 and word2.
you need to check if they are equal using an if.

Comparison should be case sensitive. "java" and "JaVa" are not equal.

if they are equal output  "word1 equals word2"
else output "word1 does not equal word2"

for example:
word1="java"
word2="java"

output:
"word1 equals word2"

word1="foo"
word2="bar"

output:
"word1 does not equal word2"
 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class Words_038 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first word:");
        String word1=scan.next();

        System.out.println("Enter second word:");
        String word2=scan.next();

        String result="";
        boolean equal=word1.equals(word2);

        if(equal){
            result="word1 equals word2";
        }else{
            result="word1 does not equal word2";
        }

        System.out.println(result);

    }
}
