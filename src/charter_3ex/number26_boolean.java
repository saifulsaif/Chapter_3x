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
public class number26_boolean {

    public number26_boolean() {
        
 Scanner cr = new Scanner(System.in); 
        System.out.println("Ente a integer number:");
        int number = cr.nextInt();
        System.out.println("Is "+number+"\n\tdivisible by 5 and 6?"
                +(number%5==0&&number%6==0)+"\n\t divisible by 5 or 6"
                +(number%5==0||number%6==0)+"\n\tdivisible by 5 or 6 ,but not both "
                +(number%5==0^number%6==0));
    }
    
    
}
