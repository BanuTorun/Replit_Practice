package forLoop;

import java.util.Scanner;

public class LoopCalculate_SumOfNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;

        if(n>1){
            for(int i=0;i<=n;i++){
                sum+=i;
            }

            System.out.print(sum);

        }
    }


}
