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
public class Number10_sub {

    public Number10_sub() {
        Scanner cr = new Scanner(System.in);
    int number1 = (int)(Math.random() * 10);
    int number2 = (int)(Math.random() * 10);

    if(number1<number2) {
    int temp = number1;
    number1 = number2;
     number2 = temp;
    }
     System.out.println("What is "+number1+"-"+number2+"?");
 
       int answer = cr.nextInt();
       if(number1-number2==answer)
            System.out.println("Your answer is correct");
       else
            System.out.println("Your answer is wrong\n"+number1+"-"+number2+"should be"+(number1-number2));

    }
}
