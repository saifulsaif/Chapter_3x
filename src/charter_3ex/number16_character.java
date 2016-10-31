/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package charter_3ex;

import java.util.Random;

/**
 *
 * @author DIU
 */
public class number16_character {

    public number16_character() {
        Random r = new Random();
       char c = (char)(r.nextInt(26) + 'A');   
        System.out.println("the character is "+c);
    }
    
    
}
