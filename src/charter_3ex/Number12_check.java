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
public class Number12_check {

    Number12_check() {
         int user_number=0;
         System.out.println("Enter a Integer value");
    Scanner cr = new Scanner(System.in);
     user_number = cr.nextInt();
      if(user_number%5==0&&user_number%6==0)
    {
        System.out.println(""+user_number+"is devisible by 5 or 6 ");
    }
      else if(user_number%5==0||user_number%6==0)
    {
        System.out.println(""+user_number+"is devisible by 5 or 6 but not both");
    }
      else
         System.out.println(""+user_number+"is not divisible by either 5 or 6");
     
    }
   
    
}
