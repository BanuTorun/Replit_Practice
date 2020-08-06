package forLoop;

import java.util.Scanner;

/*
Given a string word, if the first or last chars are 'x' or 'X',
print the string without those 'x' or 'X' chars,  otherwise print the string unchanged.

Example:
input: xHiX
output: Hi

Example:
input: apple
output: apple

input: xUxL
output: UxL

input: JavaX
output: Java
 */
public class Without_X_x_079 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String word=scan.next();

        String str="";

        for(int i=0; i<=word.length()-1; i++){
            if(i==0 && (word.charAt(i)=='x'|| word.charAt(i)=='X')){
                continue;
            }if(i==word.length()-1 && (word.charAt(i)=='x' || word.charAt(i)=='X')){
                continue;
            }else{
                str+=word.charAt(i);
            }

        }
        System.out.println(str);
    }
}
