package forLoop;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
In this task, you need to swap first name with last name in the email.
If email doesn't contains underscore - do not anything.

Example:
input: mike_tyson@gmail.com
output: tyson_mike@gmail.com

Example:
input: barakobama@gmail.com
output: barakobama@gmail.com

 */
public class Email_076 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String email = scan.next();
            if(email.contains("_")){
                String name=email.substring(0,email.indexOf('_'));
                String lastName=email.substring(email.indexOf('_')+1,email.indexOf('@'));
                String temp="";
                temp=name;
                name=lastName;
                lastName=temp;
                System.out.println(name+"_"+lastName+"@gmail.com");
            }else if(!email.contains("_")){
                System.out.println(email);
            }


        }
    }

