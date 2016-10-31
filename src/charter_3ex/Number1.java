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
public class Number1 {
    Number1()
    {   
        Scanner v = new Scanner(System.in);
        double a = v.nextDouble();
        double b = v.nextDouble();
        double c = v.nextDouble();
        double r1=0;
        double r2=0;
        r1=(-b+Math.pow((b*b-4*a*c),0.5))/2*a;
        r2=(-b-Math.pow((b*b-4*a*c),0.5))/2*a;
        System.out.println("The root are:"+r1+"and"+r2);
    }
    
}
