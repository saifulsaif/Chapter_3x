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
public class number22_circle {

    public number22_circle() {
        System.out.println("Enter inside value of (x,y)");
        Scanner cr = new Scanner(System.in);
        int x1 = cr.nextInt();
        int y1 = cr.nextInt();
        System.out.println("Enter outside value of(x,y)");
        int x2 = cr.nextInt();
        int y2 = cr.nextInt();
        double sum = (x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
        double result = Math.pow((sum),0.5);
        System.out.println("The result is:"+result);
        
        
        
    }
    
    
}
