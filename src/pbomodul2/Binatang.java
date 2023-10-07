/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbomodul2;

/**
 *
 * @author marti
 */
public abstract class Binatang implements Konstanta{
    
    String name,food,gender;
    int age,alive;
    
    public Binatang(){
       
    }
    
    public abstract String printSound();
    
    public boolean isAlive(){
        return this.alive == Alive;
    }
    
    public String printData(){
        return "Name: " + this.name + ", Age: " + this.age + ", Gender: " + this.gender + ", Food: " + this.food + ", Alive: " + isAlive();
    }
}
