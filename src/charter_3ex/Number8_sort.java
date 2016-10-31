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
public class Number8_sort {

    public Number8_sort() 
    {
        Scanner cr = new Scanner(System.in);
        System.out.println("Enter three Integer value");
        int num1 = cr.nextInt();
        int num2 = cr.nextInt();
        int num3 = cr.nextInt();
        
        if(num1>num2)
        {
           if(num2>num3)
                {
                    System.out.println("The number are"+num1+""+num2+""+num3);
                }
                else
                    System.out.println("The number are"+num1+""+num3+""+num2);
             
        }
        else
        {
           if(num2>num3)  
           {
               if(num1>num3)
                  System.out.println("The number are"+num2+""+num1+""+num3);
               else
                 System.out.println("The number are"+num2+""+num3+""+num1);
           }
           else
           {
              if(num1>num2)
                  System.out.println("The number are"+num3+""+num1+""+num2);
              else
                System.out.println("The number are"+num3+""+num2+""+num1);

           }
        }
                
     }
    
    
    
}
