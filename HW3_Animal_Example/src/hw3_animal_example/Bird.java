/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3_animal_example;

/**
 *
 * @author Solin SM
 */
public class Bird extends Pets{
    
    // Encapsulation variables
    private String namee;
    private String type;
    private String food;

    
    // Defualt Constructor
    public Bird() {}
    
    // Parameterized Constructor
    public Bird(String name, int age, boolean fly, String color, String type) {
        super(name, age, fly, color, type);
    }

    public Bird(String namee, String type, String food) {
        this.namee = namee;
        this.type = type;
        this.food = food;
    }
    
    
    //Getter
    public String getNamee(){  return namee;    }
    public String getType() {   return type;    }
    public String getFood() {   return food;    }
    
    
    //Setter
    public void setNamee(String namee)  {   this.namee = namee; }
    public void setType(String type)    {  this.type = type;    }
    public void setFood(String food)    {  this.food = food;    }
    
    
    // Override Methods (toString Method)
    @Override
    public String toString() {
        return "Bird{" + "namee=" + namee + ", type=" + type + ", food=" + food + '}';
    }
    
    
}
