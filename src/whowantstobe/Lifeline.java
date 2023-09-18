/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whowantstobe;

import java.util.Random;

public class Lifeline { //It selects the correct and incorrect answer to give the user two options
    
public static void fiftyfifty(triviaquestion q) { 
Random r = new Random();
double wrongans = 0;
boolean loop = true;

while (loop) { 
wrongans = r.nextInt(3);
if (wrongans+1 != q.ca) { //This makes sure that the secondary option generated is not equal to the correct answer ca
loop = false;
}

}

if(wrongans < q.ca) { //This makes sure that the first option is printed above and the second option is printed below
System.out.println((int) wrongans+1+")"+q.a[(int) wrongans]);
System.out.println((int) q.ca+")"+q.a[(int) q.ca -1]);
return;
}

System.out.println((int) q.ca+")"+q.a[(int) q.ca -1]);
System.out.println((int) wrongans+1+")"+q.a[(int) wrongans]);

}
}