package String_Methods;

import java.util.Scanner;

/*
Assume that you have only 2 users: Max Payne and Alan Wake.
 First, ask user to enter full name.
 Display message: "Enter full name:".
 Then take input from user.
 If name is equals to either "Max Payne" or "Alan Wake",  display message: "User found!".
 Otherwise,  display message: "User not found!". Please make your search case insensitive!

Example:
Display message: Enter full name:
input: Max Payne
Display message: User found!
 */
public class Find_A_User_059 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter full name:");
        String fullName=scan.nextLine();
        String result="";

        boolean userName=fullName.equalsIgnoreCase("Max Payne") || fullName.equalsIgnoreCase("Alan Wake");
        if(userName){
            result="user is found";
        }else{
            result=" user is not found";
        }
        System.out.println(result);

    }
}
