package String_Methods;
/*
You have a word, do the following:

1. When word has odd number of characters and:
            - 3 or more characters, print middle letter
      oak ==> a
      javav ==> v
             - Single character, print that character 3 times
      # ==> ###
      q ==> qqq

2. When word has even number of characters and:
           - 4 or more characters, print middle 2
     java ==> av
     apples ==> pl
     #$%^&* ==> %^
           - 2 characters, print those 2 characters twice
      @@ ==>@@@@
      $$ ==>$$$$
      hi ==> hihi
 */
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Midde_One_064 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your word: ");
        String word = scanner.next();
        if (word.length() == 1) {
            word = word + word + word;
            System.out.println(word);
        } else if (word.length() >= 3 && word.length() % 2 != 0) {
            char chr = word.charAt((word.length() - 1 )/ 2);
            System.out.println(chr);
        } else if (word.length() == 2) {
            String twice = word + word;
            System.out.println(twice);
        } else if (word.length() >= 4 && word.length() % 2 == 0) {
            String middle = word.substring(word.length() / 2 - 1, word.length() / 2 + 1);
            System.out.println(middle);
        }
    }
}

