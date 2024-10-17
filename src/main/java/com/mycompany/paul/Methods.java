
package com.mycompany.paul;

import java.util.Date;


public class Methods {
    public static boolean OR(boolean parameter1, boolean parameter2){
        if(parameter1 == false || parameter2 == true ){
            return true;
        }
        return false;
    } 
    public static Date getCurrentDate() {
        return new Date(); // Retorna la fecha y hora actual
    }
    

}

