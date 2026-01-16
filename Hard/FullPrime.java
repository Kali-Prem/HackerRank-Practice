// Print true if N is Full prime otherwise print false. A Full Prime is a number whose all digits is prime. Note that its not mandatory that a number will be always prime, only check if all digits is prime or not

import java.util.*;

public class FullPrime {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 235
        int sum = 0;
        int sum1 = 0;
        
        for(int i = n; i>0; i = i/10){
            int digit = i % 10;
            sum = sum + digit;
            int count = 0;
            for(int j = 1;j<=digit; j++){
                if(digit % j == 0){
                    count = count + 1;
                }
            }
            if(count == 2){
                sum1 = sum1 + digit;
            }
        }
        if(sum1 == sum){
            System.out.print(true);
        }
        else{
            System.out.print(false);
        }
    }
}