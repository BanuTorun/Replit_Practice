package String_Methods;

import java.util.Scanner;

/*
Write a switch statement that tests the value of the char variable response and performs the following actions:
if response is y, the message Your request is being processed is printed
if response is n, the message Thank you anyway for your consideration is printed
if response is h, the message Sorry, no help is currently available is printed
for any other value of response, the message "Invalid entry, please try again!" is printed

Create Scanner object.
Use charAt() method, in order to get the char value at the specified index.

 */
public class SwitchChar_56 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter commend:");
        String response=scan.next();
        char chr=response.charAt(0);

        String result="";

        switch (chr){
            case'y':
                result="Your request is being processed";
                break;
            case'n':
                result="Thank you anyway for your consideration";
                break;
            case'h':
                result="Sorry, no help is currently available";
                break;
            default:
                result="Invalid entry, please try again!";

        }

        System.out.println(result);
    }
}
