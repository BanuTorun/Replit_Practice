package String_Methods;

import java.util.Scanner;

/*
in this exercise you get a string called txt .

output txt without its last letter.

for example:

txt = "foo"

output will be:
fo

hint
use substring() and length() together to solve this.
substring will start at 0 and will end at txt length -1

 */
public class String_NoEnd_072 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter word:");
        String text=scan.next();
        String txt=text.substring(0,(text.length()-1));

        System.out.println(txt);

    }
}
