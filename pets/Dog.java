package pets; // Ensure you have the correct package declaration

import enums.Color;
import interfaces.Attribute;
import interfaces.Pet;

public class Dog implements Pet {
    private int happiness; // You can initialize this to some default value
    private int hunger;    // You can initialize this to some default value
    private Color color;   // You can initialize this to some default value

    // Constructor for Dog
    public Dog() {
        this.happiness = 0; // Initialize happiness to a default value
        this.hunger = 0;    // Initialize hunger to a default value
        this.color = Color.GRAY; // Initialize color to a default value
    }

    @Override
    public void play() {
        System.out.println("The dog is playing.");
        // Implement logic to increase happiness and hunger here
    }

    @Override
    public void feed() {
        System.out.println("The dog is being fed.");
        // Implement logic to decrease hunger here
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
        // Implement logic for the dog's sound here
    }

    @Override
    public Attribute getAttribute1() {
        // Implement logic to return an attribute
        // For example: return new HappinessAttribute();
        return null;
    }

    @Override
    public Attribute getAttribute2() {
        // Implement logic to return another attribute
        // For example: return new HungerAttribute();
        return null;
    }

    @Override
    public Color getColor() {
        return color;
    }
}
