
package com.mycompany.paul;

import java.util.Date;


public class Paul {

    public static void main(String[] args) {
        
        boolean result = Methods.OR(true, false);
        System.out.println("The result is: "+result);
        
        Date currentDate = Methods.getCurrentDate();
        System.out.println("Today is: "+currentDate);
        
        Pau paulette = new Pau(20, 168, "Blue", "black");
        System.out.println("Describing myself");
        System.out.println("Age: " + paulette.getAge());
        System.out.println("Height: " + paulette.getTall() + " cm");
        System.out.println("Eye color: " + paulette.getEyes());
        System.out.println("Hair color: " + paulette.getHair());    
        
        //quita la dirección de memoria donde esta paulette
        paulette = null;
        //garbage collector elimina paulette
        System.gc();
        System.out.println("The End");
    }
}
