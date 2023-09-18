/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whowantstobe;

/**
 *
 * @author jovan
 */
public class triviaquestion extends Questions{
    public String[] a;
    public String Quest;
    
    //The constructor is passed the question itself and a series of answers which is stored inside an array
    public triviaquestion(String ans1,String ans2, String ans3, String ans4, String Quest, int ca){
        super(ca);
        
        this.a = new String[4];
        this.a[0]=ans1;
        this.a[1]=ans2;
        this.a[2]=ans3;
        this.a[3]=ans4;
        this.Quest = Quest;
        }
      
    public String toString(){
    return this.Quest+"\n"+"1)"+this.a[0]+"\n"+"2)"+this.a[1]+"\n"+"3)"+this.a[2]+"\n"+"4)"+this.a[3];
    }
}
