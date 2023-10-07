/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbomodul2;

/**
 *
 * @author marti
 */
public class Cat extends Binatang {
    
    public Cat(String name,String gender,String food,int age,int alive){
        this.name = name;
        this.gender = gender;
        this.food = food;
        this.age = age;
        this.alive = alive;
    }    
    
    @Override
    public String printSound(){
        return "Meow";
    }
    
    @Override
    public String printData(){
        return super.printData();
    }
}
