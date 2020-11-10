/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solin.sm.animals_example;

/**
 *
 * @author SolinSM
 */
public class Dogs implements Animal{

    private String name;
    private int age;
    private boolean fly;
    private String color;
    private String type;

    // Defualt Constructor
    public Dogs() {
    }

    // Parmetrize Constructor
    public Dogs(String name, int age, boolean fly, String color, String type) {
        this.name = name;
        this.age = age;
        this.fly = fly;
        this.color = color;
        this.type = type;
    }
    
    //Getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isFly() {
        return fly;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }
    
    
    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    // Overide from Interface Animal
    @Override
    public void move() {
        System.out.println("In nice move on 4 legs");
    }

    @Override
    public void skin() {
        System.out.println("Soft");    
    }

    @Override
    public void sound() {
        System.out.println("Meaow");
    }

    @Override
    public void sleep() {
        System.out.println("Cute Sleep, Zz..");
    }

    
    //methods
    @Override
    public String toString() {
        return "Dogs{" + "name=" + name + ", age=" + age + ", fly=" + fly + ", color=" + color + ", type=" + type + '}';
    }
    
    public void nice(){
        System.out.println("It's nice and cute");
    }
    
    public void sayWoo(){
        System.out.println("Wooooo!");
    }
}
