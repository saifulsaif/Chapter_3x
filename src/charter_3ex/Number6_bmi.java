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
public class Number6_bmi {

    public Number6_bmi() {
        Scanner cr = new Scanner(System.in);
        System.out.println("Enter your weight:");
        double weight = cr.nextDouble();
        System.out.println("Enter your height:");
        double height_feet = cr.nextDouble();
        double height_ins=height_feet/39.3700787;
        double weight_pound=weight/2.20462;
        double bmi=weight_pound/Math.pow(height_ins,2);
        double result=Math.round(bmi*100)/100;
        System.out.println(result);
                
        
    }
    
    
}
