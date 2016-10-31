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
public class if_condition {

    public if_condition() {
        System.out.println("Enter three number:");
        Scanner cr = new Scanner(System.in);
        int a=cr.nextInt();
        int b=cr.nextInt();
        int c=cr.nextInt();
        
        
        if(a>b)
        {
            int temp=b;
            b=a;
            a=temp;
        }
        if(b>c)
        { 
            int temp = b;
            b=c;
            c=temp;
           
        }
        if(a>b)
        {
             int temp=b;
            b=a;
            a=temp;
        }
        System.out.println("The number are "+a+""+b+""+c);
       
    }
    
    
}
