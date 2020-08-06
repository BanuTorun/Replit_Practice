package String_Methods;

import java.util.Scanner;

/*
using charAt method output the 3rd letter of txt string then the 5th letter then the 6th letter.

use print not println.

 */
public class String_charAt {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter a word:");
        String txt=s.next();
        char chr1=txt.charAt(2);
        char chr2=txt.charAt(4);
        char chr3=txt.charAt(5);

        System.out.println(chr1);
        System.out.println(chr2);
        System.out.println(chr3);
    }
}
