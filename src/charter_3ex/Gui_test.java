/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package charter_3ex;

import javax.swing.JOptionPane;

/**
 *
 * @author DIU
 */
public class Gui_test {
     Gui_test(){
     
       double  a = 6;
        System.out.println("The value is "+a++);
        double b=0;
        double bb=0;
        b=++a;
        bb=a++;
        double c=10;
  
        System.out.println("The value is"+b);
        System.out.println("The bb value is"+bb);
         c+=b;
         System.out.println("add" +c);
         c-=b;
         System.out.println("sub" +c);
         c*=b;
        System.out.println("mul" +c);
        c/=b;
        System.out.println("div"+c);                                                    
        String frist_value=JOptionPane.showInputDialog( null,"Enter  frist int value ");
        int f_value=Integer.parseInt(frist_value);
        String second_value=JOptionPane.showInputDialog( null,"Enter second int value ");
        int s_value=Integer.parseInt(second_value);
         int add = (f_value+s_value);
        JOptionPane.showMessageDialog(null, "add="+add);
         int sub = (f_value-s_value);
        JOptionPane.showMessageDialog(null, "sub="+sub);
         int mul = (f_value*s_value);
        JOptionPane.showMessageDialog(null, "mul="+mul);
         int div = (f_value/s_value);
        JOptionPane.showMessageDialog(null, "div="+div);
        
        
        
           
       
    }
}
