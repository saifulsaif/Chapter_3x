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
public class number21_year {

    public number21_year() {
        Scanner cr = new Scanner(System.in);
        System.out.println("Enter year");
        int year = cr.nextInt();
        System.out.println("Enter month:(1-12)");
        int month=cr.nextInt();
        System.out.println("Enter day of the month:(1-31)");
        int q =cr.nextInt();
        if(month==1)
        {
            month+=12;
        }
        else if (month==2)
        {
            month+=13;
        }
        System.out.println(month);
        
    }
    
    
}
