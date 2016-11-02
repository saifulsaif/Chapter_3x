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
public class Charter_3ex {
    private static String z;
    static Scanner cr = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Gui_test g = new Gui_test(); 
      System.out.println("Welcome to java Programming");
      //if_statement();
      //if_else();
      //if_statement_com();
      //income();
      //percentage();
      //evaluate();
      //age();
      //Number1 n = new Number1();
      //Number2 n = new Number2();
      //Number3 n = new Number3();
      //Number4 n = new Number4();
      //Number5 n = new Number5();
      //Number6_bmi n = new Number6_bmi();
      //Number8_sort n = new Number8_sort();
      //Number_ISBN n = new Number_ISBN();
      //Number10_sub n = new Number10_sub();
      //Number12_check n = new Number12_check();
      //Birthday b = new Birthday();
      //if_condition c = new if_condition();
     // Number14_coin c = new Number14_coin();
     // number15_lottery c = new number15_lottery();
      //number17_game n = new number17_game();
      //number16_character n = new number16_character();
      //number21_year a =  new number21_year();
     // number22_circle a = new number22_circle();
     // number23_card a = new number23_card();
      number26_boolean a = new number26_boolean();
    }
    public static void if_statement(){
    
        Scanner cr = new Scanner(System.in);
        int number;
              System.out.println("Enter a Integer  number:");
        number=cr.nextInt();
        if(number%5==0)
             System.out.println("hifive");
        if(number%2==0)
            System.out.println("Hitwo"); 

    }
    public static void if_else()
    {
      Scanner cr = new Scanner(System.in);
      int num;
        System.out.println("Enter a number:");
      num=cr.nextInt();
      if(num%2==0)
      {
          System.out.println("Even number");
      }
      else
      {
          System.out.println("Odd number");
      }
    }
   public static void if_statement_com()
   {
       Scanner cr = new Scanner(System.in);
       int x = cr.nextInt();
       int y = cr.nextInt();
       int z=0;
       if(x>2){
           if(y>3)
         z = x+y ;
           System.out.println("The z value is "+z);
       }
           else
           System.out.println("Or x the value is"+x);
       }
    
     public static void income()
     {
         System.out.println("Enter your income amount:");
         Scanner cr = new Scanner(System.in);
         int income = cr.nextInt();
         double tax=0;
         if (income<=10000)
         {
             tax=income*0.1;
             System.out.println("The tax is"+tax);
             
         }
         if(income>=10000 && income<=20000)
         {
             tax=1000+(income-10000)*0.15;
             System.out.println("The tax is "+tax);
         }
     }
     public static void percentage()
     {
         System.out.println("Enter a integer value:");
         Scanner cr = new Scanner(System.in);
         int value = cr.nextInt();
         int percentage=0;
         if(value>90)
         {
             
             percentage=(value*3)/100;
             System.out.println("The percentage is "+percentage);
         }
         else 
         {
               percentage=(value*1)/100;
             System.out.println("The percentage is "+percentage);
         }
     
     }
     public static void evaluate()
     { 
         Scanner input = new Scanner(System.in);
         System.out.println("Enter Three number:");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double z = input.nextDouble();
        System.out.println("(x < y && y < z) is " + (x < y && y < z));
        System.out.println("(x < y || y < z) is " + (x < y || y < z));
        System.out.println("!(x < y) is " + !(x < y));
        System.out.println("(x + y < z) is " + (x + y < z));
        System.out.println("(x + y < z) is " + (x + y < z));
}
     
     public static void age()
     {
       System.out.println("Enter your age:");
       Scanner input = new Scanner(System.in);
       double x = input.nextInt();
       int y=13,z=18;
       System.out.println("(x < y || x < z) is " + (x < y || x < z));  
     }
  }
                      
   
   






