/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package charter_3ex;

import java.util.Scanner;

/**
 *
 * @author DIU
 */
public class number15_lottery {

    public number15_lottery() {
        int lottery = (int)(Math.random()*100);
        Scanner cr = new Scanner(System.in);
        int lottery1=lottery/10;
        int lottery2=lottery%10;
        System.out.println("Enter your guess number:");
         int  guess= cr.nextInt();
         int guess1=guess/10;
         int guess2=guess%10;
         System.out.println("The lottery number is :"+lottery);
         if(lottery==guess)
         {
             System.out.println("Exact match:you win $10,00");
         }
         else if(guess1==lottery2&&guess2==lottery1)
         {
             System.out.println("Match all digits: you ein $3,000");
         }
         else if(guess1==lottery1
                 ||guess1==lottery2
                 ||guess2==lottery1
                 ||guess2==lottery2)
         {
             System.out.println("Match one digit: you win $1,000");
         }
         else
             System.out.println("Sorry ,no match");
         
    }
    
    
}
