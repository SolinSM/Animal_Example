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
public class Pets implements Animal_Interface{
    
    // Encapsulation variables
    private String name;
    private int age;
    private boolean fly;
    private String color;
    private String type;

    // Defualt Constructor
    public Pets() {}

    // Parameterized Constructor
    public Pets(String name, int age, boolean fly, String color, String type) {
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
    public void move() {    System.out.println("This is nice move");    }

    @Override
    public void skin() {    System.out.println("Soft Lovely Skin");     }

    @Override
    public void sound() {   System.out.println("Pet Sound is awesome"); }

    @Override
    public void sleep() {   System.out.println("Sleep, Zz..");          }
    
    
    // Class Methods
    public void attack(){
	System.out.println("Attacking");
    }

    public void eat(){
        System.out.println("Eating");
    }

    public void rest(){
        System.out.println("Resting");
    }
    
    // Overload Methods
    public int speed(){
        int speed = 2;
        return speed;
    }
    
    public String speed(Bird b){
        double speed = 2.6;
        String bird_speed = b.getNamee() + " " + speed;
        return bird_speed;
    }
}
