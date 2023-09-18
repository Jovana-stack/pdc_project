/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whowantstobe;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Whowantstobe {
     public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        System.out.println("=====(Who wants to be a millionaire?)=====");
        System.out.println("Enter your name:");
        String name = input.nextLine();
       
       
        user user = new user(name);
       
        try {  //This try catch is for outputting an error if Questiongen class could not find 
             var allQuestions = Questiongen.Questiongenrater();
            var questionManager = new QuestionManager(allQuestions);

            boolean loop;
            int UserAns;
            int i = 0;

            while (true) {
                i++;
                loop = true;
                var q = questionManager.getUnusedQuestion();

                    while(loop){   //This while loop will loop untill the user has input a valid answer
                    System.out.println(q);
              
                    try{  //This try catch is for catching invalid inputs
                   
                   
                        if(user.lifelines != 0 && q instanceof triviaquestion) {  //This if statement is for seeing if the user can still use lifelines 
                       
                            System.out.println("You have:  "+user.lifelines+" lifelines left");
                            System.out.println("Enter '5' to use one");
                            UserAns = input.nextInt();
                            if(UserAns == 5) {
                            Lifeline.fiftyfifty((triviaquestion) q);                            
                            int Lifelines = user.getLifelines();
                            Lifelines -= 1;
                            user.setLifelines(Lifelines);
                             UserAns = input.nextInt();
                            }
                        }else{
                        UserAns = input.nextInt();
                        }
                        if((UserAns > 0 && UserAns <= 4)||(q instanceof mathquestion)){ //This makes sure that the input is within the valid range 

                            
                            if(q.checkAns(UserAns)){ //This checks if the answer is correct, if so the player keeps playing 
                                if(i != 15) { //This checks if the player has answered 15 questions correct and if so it ends the game
                                user.moneyupdate(i);                                                              
                                System.out.println("Right answer! Total money: $"+user.money);
                               
                               
                            }else{
                           
                            user.money = 1000000;  //Sets the money to 1000000 and ends the game 
                            System.out.println("You win $1,000,000");
                            return;
                            }
                                                     
                           
                           
                            }else{
                               
                                System.out.println("Wrong answer you get to leave with $"+user.money); //Ends the game if the player answers the questions incorrectly 
                               
                                return;
                            }
                            loop = false;
                        }else{
                            System.out.println("Out side of range inputs must be a integer from 1 to 4");
                        }
                    }catch(InputMismatchException e){ //This handles invalid inputs by clearing the scanner 
                        input.next();
                        if(q instanceof mathquestion){ //This handles different error text depending on whether the question is the math question or trivia question
                            System.out.println("Inputs must be a integer");
                        }else{
                            System.out.println("Inputs must be a integer from 1 to 4");
                        }                        
                    }
                }
            }
           
        } catch (FileNotFoundException ex) {
            System.err.println("File not found");
        }
       
       
        input.close();
    }

}

