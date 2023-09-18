/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whowantstobe;

/**
 *
 * @author jovan
 */
public class mathquestion extends Questions{
    double x;
    double y;
    String op;
  
    public mathquestion (double x, double y,String op,double ca){
        super(ca);
        this.x = x;
        this.y = y;
       
        this.op = op;
    }
   
    @Override 

    public String toString (){  //toString prints out the usable string
        return this.x + this.op + this.y ;
    }
    
    
    
    
    
}