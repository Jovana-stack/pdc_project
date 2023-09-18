/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whowantstobe;

/**
 *
 * @author jovan
 */
public class user {
  String name;
    public int money;
    public int lifelines;
   
    public int getLifelines() {
return lifelines;
}

public void setLifelines(int lifelines) {
this.lifelines = lifelines;
}

public user(String name){
        this.name =name;
        this.money = 0;
        this.lifelines = 3;
    }
   
    public int getMoney() {
return money;
}

public void setMoney(int money) {
this.money = money;
}

public void moneyupdate(int i) { //This takes the amount of questions the player has answered and updates the monay accordingly
   
    if(i == 1) {
    this.money = 100;
   
    return;
    }  
    if(i < 5) {
    int oldmoney = this.getMoney();
    this.money = oldmoney + 100;
    return;    
    }if(i == 5){
    this.money  = 1000;  
    return;
    }if(i < 10) {
    int oldmoney = this.getMoney();
    this.money = oldmoney + 1000;
    return;    
    }if(i == 10) {
    this.money = 10000;
    return;
    }if(i < 15) {
    int oldmoney = this.getMoney();
    this.money = oldmoney + 10000;
    return;    
    }
    System.out.println("Error i missmatch");
   
   
}
}