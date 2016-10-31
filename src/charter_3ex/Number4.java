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
public class Number4 {

     Number4() {
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
    }
    
}
