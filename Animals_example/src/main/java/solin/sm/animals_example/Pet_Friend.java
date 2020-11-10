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
public class Pet_Friend {
    
    // Data Coupling : call function from class in another function relate to another class
    // Stamp Coupling : use object and using some of param
    // We should reduce using coupling
    
    Animal a;
    
    public void setA(Animal a){  // Stamp Coupling
        this.a = a;
    }
    
    public void startWalk(){
        a.move();   // Data Coupling
    }
    
    public void catName(Cats c){    // This is Stamp Coupling (Cats c)
        System.out.println("The type & name of cat is : " + c.getType() + " " + c.getName());     // Data Coupling in print
    }
    
    /* better to reduce Coupling is to define ( String Type , String name ) instead of ( Cats c )*/
    
    
}
