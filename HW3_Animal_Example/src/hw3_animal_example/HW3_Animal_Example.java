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
public class HW3_Animal_Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal_Interface animal_cat = new Cat();   // upcast
        animal_cat.sound();
        
        Animal_Interface a_cat = new Cat("Kity", 3 , false , "grey & white", "Faresy");
        a_cat.move();
        
        Cat c = new Cat();
        // Define values of cat
        c.setName("Besty");
        c.setType("sherazy");
        c.setColor("Gold");
        c.setAge(6);
        c.setFly(false);
        
        // print result methods & info of above cat
        c.sayMeow();
        c.skin();
        c.cute();
        c.awesome();
        System.out.println(c.toString());
        
        // We can do same to Dogs
        System.out.println("===================================");
        System.out.println("Test Pet_fiend class\n");
        
        Pet_Friend p_friend = new Pet_Friend();
        p_friend.setA(a_cat);
        p_friend.startWalk();
        p_friend.catName(c);
        
        System.out.println("===================================");
        System.out.println("Test Pets & Birds classes\n");
        
        // Test Pets & Birds classes
        Pets p = new Bird("Tweety", 2, true, "Yellow & Gold", "Knary");
        p.attack();
        p.eat();
        
        System.out.println(p.speed());
        Bird b =  new Bird("Temo", "Knary", "Bread crumbs");
        System.out.println(p.speed(b));
        
    }
    
}
