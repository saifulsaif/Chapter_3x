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
public class number17_game {

    public number17_game() {
        
        int number = (int)(Math.random()*3);
        Scanner cr = new Scanner(System.in);
        System.out.println("Enter scissor(0)\n rock(1)\n papre(2)");
        int guess=cr.nextInt();
        if(number==0)
        {
            if(guess==0)
            System.out.println("The computer is scissor.You are scissor too.");
            else if(guess==1)
                System.out.println("The computer is scissor.but you are rock");
            else if(guess==2)
                System.out.println("The computer is scissor . you are paper");
            else
                System.out.println("Your input is worng");
        }
        else if (number==1)
        
        if(guess==0)
            System.out.println("The computer is rock.You are scissor .");
            else if(guess==1)
                System.out.println("The computer is rock.but you are rock too");
            else if(guess==2)
                System.out.println("The computer is rock . you are paper");
            else
                System.out.println("Your input is worng");
        else if(number==2)
           
         if(guess==0)
            System.out.println("The computer is paper.You are scissor .");
            else if(guess==1)
                System.out.println("The computer is paper.but you are rock");
            else if(guess==2)
                System.out.println("The computer is paper . you are paper too");
            else
                System.out.println("Your input is worng");
        
    }
    
    
}
