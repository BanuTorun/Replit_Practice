package String_Methods;

import java.util.Scanner;

/*
Let's say I've got a 100$ gift card and you want to buy something in your online store .
Write a program that will help me to buy something and display leftover balance after purchase.
If item is not in the list, display message: "Invalid item!".
 If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".
Hint
Use if/ else if / else
CODE EXAMPLE:
Example #1
input: Hat
output: Thank you for your purchase!
output: Your current balance is: 75$

Example #2
input: Pants
output: Thank you for your purchase!
output: Your current balance is: 50$

Example #3
input: Laptop
output: Sorry, not enough funds on your gift card!

Example #4
input: Cupcake
output: Invalid item!
List of items
 */
public class Gift_Card_035 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String input=scan.nextLine();
        if(input.equalsIgnoreCase("Smartphone")){
            System.out.println("Sorry, not enough funds on your gift card!");
        }else if(input.equalsIgnoreCase("Laptop")){
            System.out.println("Sorry, not enough funds on your gift card!");
        }else if(input.equalsIgnoreCase("Charger")){
            int balance=100-15;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+balance+"$");
        }else if(input.equalsIgnoreCase("USB Cable")){
            int balance=100-10;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+balance+"$");
        }else if(input.equalsIgnoreCase("Headphones")){
            int balance=100-30;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+balance+"$");
        }else if(input.equalsIgnoreCase("Blanket")){
            int balance=100-60;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+balance+"$");
        }else{
            System.out.println("invalid item");
        }
    }
}
