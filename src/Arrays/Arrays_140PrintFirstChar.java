package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_140PrintFirstChar {
    /*
    Given a String array words, iterate through each word and print first and last letter of each element in the format below.

Example:

words → ["hello", "why", "by", "apple" , "note"]
print → [ho, wy, by, ae, ne]

     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


            String[]firstLast=new String[words.length];
            for(int i=0;i<=words.length-1;i++){
                firstLast[i]=""+words[i].charAt(0)+words[i].charAt(words[i].length()-1);

            }
            System.out.print(Arrays.toString(firstLast));
        }



    }

