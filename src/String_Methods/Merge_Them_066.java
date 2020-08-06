package String_Methods;

import java.util.Scanner;

/*
You have 2 words, both of them have 3 characters.
If either of them does not have exactly 3 characters, print "cannot merge"
Merge their characters one by one and print together like below:

aok
lol
alookl

ear
pie
epaire

java
wow
cannot merge

hint:
by inserting +""+ (empty string) between chars, you can concatenate char values.
 */
public class Merge_Them_066 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter word1:");
        String word1=scan.next();
        System.out.println("Enter word2:");
        String word2=scan.next();
        String merged="";
        if (word1.length()==3&&word2.length()==3){
            merged=""+word1.charAt(0)+word2.charAt(0)+word1.charAt(1)+word2.charAt(1)+word1.charAt(2)+word2.charAt(2);
        }else{
            merged="can not be merged";
        }
        System.out.println(merged);
    }
}
