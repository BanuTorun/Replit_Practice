package String_Methods;

import java.util.Scanner;

/*
ask the user for his name, capture it on a string using scanner.

then output the length of the name string.
 */
public class String_length {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=scan.next();
        int name2=name.length();

        System.out.println(name.length());


    }
}
