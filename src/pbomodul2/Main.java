/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbomodul2;

/**
 *
 * @author marti
 */
public class Main {
    
    void Show(){
        Cat kucing = new Cat("Tom","Male","Whiskas",4,1);
        Dog anjing = new Dog("Spike","Male","Pedigree",5,1);
        Duck bebek = new Duck("Donald","Male","Cacing",2,0);
        Horse kuda = new Horse("Laire","Female","Rumput",7,1);
        
        System.out.println("Kucing");
        System.out.println(kucing.printData());
        System.out.println("Cat sound: " + kucing.printSound());
        System.out.println("");
        System.out.println("Anjing");
        System.out.println(anjing.printData());
        System.out.println("Dog sound: " + anjing.printSound());
        System.out.println("");
        System.out.println("Bebek");
        System.out.println(bebek.printData());
        System.out.println("Duck sound: " + bebek.printSound());
        System.out.println("");
        System.out.println("Kuda");
        System.out.println(kuda.printData());
        System.out.println("Horse sound: " + kuda.printSound());
    }
    
    public static void main(String[] args) {
        Main main = new Main();
        main.Show();
    }
}
