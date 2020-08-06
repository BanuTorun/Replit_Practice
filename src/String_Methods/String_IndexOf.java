package String_Methods;

import java.util.Scanner;

/*
using indexOf method output the position of b inside txt string.
then output the index of "foo"

use System.out.println() to output each index of requested.
 */
public class String_IndexOf {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String txt = "foo bar";
        System.out.println(txt.indexOf('b'));
        System.out.println(txt.indexOf('f'));
        System.out.println(txt.indexOf('o'));
        System.out.println(txt.indexOf('o'+" "));
        System.out.println(txt.indexOf(" "));
        System.out.println(txt.indexOf('a'));
        System.out.println(txt.indexOf('r'));


    }
}
