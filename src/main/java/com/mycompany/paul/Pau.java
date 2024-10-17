
package com.mycompany.paul;

public class Pau {
    private int age, tall;
    private String eyes, hair;  // Aquí 'String' va con mayúscula

    // Constructor method
    public Pau(int age, int tall, String eyes, String hair) {
        this.age = age;
        this.tall = tall;
        this.eyes = eyes;
        this.hair = hair;
    }

    //getters and setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTall() {
        return tall;
    }

    public void setTall(int tall) {
        this.tall = tall;
    }

    public String getEyes() {
        return eyes;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }
    
    @Override
    protected void finalize() throws Throwable {
        try {
            // liberar recursos del objeto paulette
            System.out.println("Finalizing Pau object. Cleaning up resources.");
        } finally {
            
            super.finalize();
        }
    }
    
}

