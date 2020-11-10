/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solin.sm.animals_example;

/**
 *
 * @author Solin
 */
public class Birds extends Pets{
    
    private String namee;
    private String color;
    private String type;
    private String food;

    public Birds(String namee, String color, String type, String food) {
        this.namee = namee;
        this.color = color;
        this.type = type;
        this.food = food;
    }
    
    
    //Getter
    public String getNamee() {
        return namee;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public String getFood() {
        return food;
    }
    
    
    //Setter
    public void setNamee(String namee) {
        this.namee = namee;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setFood(String food) {
        this.food = food;
    }
    
}
