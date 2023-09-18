/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whowantstobe;

import java.util.Random;

/**
 *
 * @author jovan
 */
public class MathQuestionGenerator {
   
    public static mathquestion generateQuestion(){
       Random r = new Random();  //This generates a random math question
       
      
       String operation = "";  //This is used for the toString method to make sure that the correct operation is displayed
       double x = r.nextInt(100);
       double y = r.nextInt(100);
       
       int op = r.nextInt(3);
       double Ans = 0;
       
       switch(op){ //This switch statement uses the randomly generated op value to calculate the operation and the correct answer
           case 0:
               operation = "+";
               Ans = x+y;
               break;
            case 1:
               operation = "-";
               Ans = x-y;
               break;
            case 2:
               operation = "*";
               Ans = x*y;
               break;
            case 3:
               while(y == 0){
                   y = r.nextInt(100);
               }
               operation = "/";
               Ans = x/y;
               break;
       }
       
       mathquestion q = new mathquestion(x,y,operation,Ans); //Initializes the math question and returns it back to the Qestiongen class
       return q;
   }
    
    
}
