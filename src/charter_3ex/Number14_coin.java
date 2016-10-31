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
public class Number14_coin {

     Number14_coin() {
         
        int number =(int)(Math.random()*2);
        Scanner cr = new Scanner(System.in); 
        System.out.println(" Guess head = 1 \n And tail = 0; ");
        int user_input=cr.nextInt();
        if(number==user_input)
        {
             System.out.println("YES YOUR GUESS IS CORRECT!");
        }
        else
        {
            System.out.println("SORRY YOUR GUESS IS NOT CORRECT!");
        }
       
        
    }
    
}
