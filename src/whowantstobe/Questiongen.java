/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whowantstobe;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jovan
 */
public class Questiongen {
    
    public static ArrayList<Questions> Questiongenrater() throws FileNotFoundException{
        
        ArrayList<Questions> questionlist = new ArrayList<>(); //This array list conains all the questions that will be used in the quiz
        File file = new File(("C:\\Users\\jovan\\OneDrive\\Documents\\NetBeansProjects\\cui2.0\\src\\whowantstobe\\questionlist"));//The file location of all the possible trivia questions
        Scanner s = new Scanner(file);
        Random r = new Random();
        
        ArrayList<Questions> triviaQuestionList = new ArrayList<>(); //An array list to store all the possible trivia questions
        
            for(int i =0; i< 29;i++){ //This grabs the information from the questionlist file and uses it to initialize questions that it stores in the triviaQuestion array list
                String Quest = s.nextLine();
                String ans1 = s.nextLine();
                String ans2 = s.nextLine();
                String ans3 = s.nextLine();
                String ans4 = s.nextLine();
                int ca = s.nextInt();
                s.nextLine();
                triviaquestion q = new triviaquestion(ans1,ans2,ans3,ans4,Quest,ca);
                triviaQuestionList.add(q);
            }
        
        
       
        for(int i =0; i< 15;i++){  
            int qtype = r.nextInt(5); //Randomly selects questions out of the triviaQuestionList and stores it along with random math questions iniside the questionlist
            
            if(qtype == 0){
                mathquestion q = MathQuestionGenerator.generateQuestion();
                questionlist.add(q);
            
            }else{
                int tq = r.nextInt(28);
                
                questionlist.add(triviaQuestionList.get(tq));
            }
        }
        s.close();
        return questionlist;
    
    }
    
}
