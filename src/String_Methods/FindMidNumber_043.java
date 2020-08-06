package String_Methods;

import java.util.Scanner;

/*
Write a program that will return mid number out of three numbers.  No need to do any calculations.

Steps to write a program:
Create an object of Scanner class.
Declare int 3 variables: num1, num2, num3.

Example 1:
Display prompt: "Enter first number:"
14
Display prompt: "Enter second number:"
52
Display prompt: "Enter third number:"
25
Display prompt: "Medium value is: 25"

Example 2:
Display prompt: "Enter first number:"
140
Display prompt: "Enter second number:"
34
Display prompt: "Enter third number:"
1
Display prompt: "Medium value is: 34"
 */
public class FindMidNumber_043 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1=scan.nextInt();
        System.out.println("Enter second number:");
        int num2= scan.nextInt();
        System.out.println("Enter third number:");
        int num3=scan.nextInt();

        int mediumNumber=0;

        if(num1>num2&&num2<num3&&num1<num3){
            mediumNumber=num2;
        }else if(num1<num2&&num1<num3&&num3<num2){
            mediumNumber=num3;
        }else if(num1>num2&&num1<num3&&num2<num3){
            mediumNumber=num1;
        }else if(num1>num3&&num1<num2&&num1>num3){
            mediumNumber=num1;
        }else if(num1>num2&&num1>num3&&num2<num3){
            mediumNumber=num3;
        }else if(num1>num2&&num1>num3&&num2>num3){
            mediumNumber=num2;
        }
        System.out.println("medium value is: "+mediumNumber);

    }
}
