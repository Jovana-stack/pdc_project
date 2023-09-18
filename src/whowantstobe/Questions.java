/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whowantstobe;

/**
 *
 * @author jovan
 */
public class Questions {
   
    public double ca;
    
    public Questions( double ca){
        
        this.ca = ca;
        
        }

    public boolean checkAns(double answer){ //The boolean menthod that checks if the user's answer is correct
        if (this.ca ==answer){
            
            return true;
        }
            
       return false;
    }
    
    
    
    
    
    
    
    
}