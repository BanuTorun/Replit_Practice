package String_Methods;

import javax.management.MBeanAttributeInfo;
import java.util.Scanner;

/*
using substring method output the first two letters of txt string
for examole:
String txt = "foo"
the first two letters are "fo"


use print not println.

 */
public class String_substring_083 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter word:");
        String txt=scan.next();
        String text=txt.substring(0,2);

        System.out.println(text);
    }
}
