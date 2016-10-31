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
public class Number_ISBN {

    public Number_ISBN() {
        Scanner cr = new Scanner(System.in);
        String[] args = null;
        int n = Integer.parseInt(args[0]);
        int sum = 0;
        for (int i = 2; i <= 10; i++) {
            int digit = n % 10;               
            sum = sum + i * digit;
            n = n / 10;
        }
        System.out.println(args);
    }
    
    
}
