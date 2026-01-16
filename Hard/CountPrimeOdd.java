// Count number of digits in an integer which is prime as well as odd


import java.util.*;

public class CountPrimeOdd {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 235
        // int sum = 0;
        // int sum1 = 0;
        int count1 = 0;
        
        for(int i = n; i>0; i = i/10){
            int digit = i % 10;
            //sum = sum + digit;
            int count = 0;
            for(int j = 1;j<=digit; j++){
                if(digit % j == 0){
                    count = count + 1;
                }
                          
            }
            if(count == 2){
                //System.out.print("Prime no:" + digit);
                
                if(digit % 2 != 0){
                    count1 = count1 + 1;
                }
            }
            
        }
        System.out.print(count1);
        
        
    }
}