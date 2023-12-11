package pets; 

import enums.Color;
import interfaces.Attribute;
import interfaces.Pet;

public class Dog implements Pet {
    private int happiness; 
    private int hunger;    
    private Color color;   

    public Dog() {
        this.happiness = 0; 
        this.hunger = 0;    
        this.color = Color.GRAY; 
    }

    @Override
    public void play() {
        System.out.println("The dog is playing.");
        happiness++;
        hunger++;
    }

    @Override
    public void feed() {
        System.out.println("The dog is being fed.");
        hunger--;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    @Override
    public Attribute getAttribute1() {
        return new HappinessAttribute();
    }

    @Override
    public Attribute getAttribute2() {
        return new HungerAttribute();
    }

    @Override
    public Color getColor() {
        return color;
    }
}