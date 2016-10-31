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
public class Number3 {

    public Number3() 
    {   Scanner cr = new Scanner(System.in);
        System.out.println("Enter value of a");
        double a=cr.nextDouble();
        System.out.println("Enter value of b");
        double b=cr.nextDouble();
        System.out.println("Enter value of c");
        double c=cr.nextDouble();
        System.out.println("Enter value of d");
        double d=cr.nextDouble();
        System.out.println("Enter value of e");
        double e=cr.nextDouble();
        System.out.println("Enter value of f");
        double f=cr.nextDouble();
        double x = (e*d-b*f)/(a*d-b*c);
        double y = (a*f-e*c)/(a*d-b*c);
        System.out.println("The x is:"+x);
        System.out.println("The y is:"+y);


                                        
        
    }
    
    
}
