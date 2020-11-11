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
public class Cat implements Animal_Interface{
    
    // Encapsulation variables
    private String name;
    private int age;
    private boolean fly;
    private String color;
    private String type;

    // Defualt Constructor
    public Cat() {}
    
    // Parameterized Constructor
    public Cat(String name, int age, boolean fly, String color, String type) {
        this.name = name;
        this.age = age;
        this.fly = fly;
        this.color = color;
        this.type = type;
    }
    
    //Getter
    public String getName() {   return name;    }
    public int getAge()     {   return age;     }
    public boolean isFly()  {   return fly;     }
    public String getColor(){   return color;   }
    public String getType() {   return type;    }
    
    
    // Setter
    public void setName(String name)    {   this.name = name;   }
    public void setAge(int age)         {   this.age = age;     }
    public void setFly(boolean fly)     {   this.fly = fly;     }
    public void setColor(String color)  {   this.color = color; }
    public void setType(String type)    {   this.type = type;   }

    
    // Overide Animal_Interface (Implement Methods)
    @Override
    public void move() {    System.out.println("In nice move on 4 legs my sweet " + getName() );    }

    @Override
    public void skin() {    System.out.println("Soft " + getColor() + " skin");    }

    @Override
    public void sound() {   System.out.println("Meow");    }

    @Override
    public void sleep() {   System.out.println("Cute Sleep, Zz..");    }
    
    
    // Override Methods (toString Method)
    @Override
    public String toString() {
        return "Cat{" + "name=" + name + ", age=" + age + ", fly=" + fly + ", color=" + color + ", type=" + type + '}';
    }
    
    
    // Class Methods
    public void awesome(){
        System.out.println("Being more awesome than dog...");
    }
    
    public void cute(){
        System.out.println("It's cute pet");
    }
    
    public void sayMeow(){
        System.out.println("Meow! Meow!");
    }
    
}
