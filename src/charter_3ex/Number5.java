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
public class Number5 {

    public Number5()
    {
         Scanner cr = new Scanner(System.in);
         System.out.println("Enter two integer value:");
         int frist_value=cr.nextInt();
         int Secend_Value=cr.nextInt();
         System.out.println("Enter sum of those values:");
         int sum = cr.nextInt();
         int frist_sum=frist_value+Secend_Value;
         if (sum==frist_sum)
         {
             System.out.println("Answer is correct");
         }
         else
         {
             System.out.println("Answer is incorrect");
         }
         System.out.println("Enter another interger number:");
         int third_value=cr.nextInt();
         System.out.println("Enter sum of all values:");
         int user_sum=cr.nextInt();
         int final_sum=frist_sum+third_value;
         if(user_sum==final_sum)
         {
             System.out.println("All answer is correct");
         }
         else
         {
             System.out.println("Last sum is incorrect");
         }
    }
    
    
}
