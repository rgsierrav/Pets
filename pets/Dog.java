package pets;

import java.io.IOException;
import java.io.Serializable; // Import Serializable
import enums.Color;
import interfaces.Attribute;
import interfaces.Pet;
import attributes.HappinessAttribute;
import attributes.HungerAttribute;

public class Dog implements Pet, Serializable { // Implement Serializable
    private Attribute happiness;
    private Attribute hunger;
    private Color color;

    public Dog() {
        this.happiness = new HappinessAttribute();
        this.hunger = new HungerAttribute();
        this.color = Color.BROWN;
    }

    @Override
    public void play() {
        System.out.println("The dog is playing.");
        happiness.incrementValue();
        hunger.incrementValue();
        System.out.println("Happiness level increased");
        System.out.println("Hunger level increased");
    }

    @Override
    public void feed() {
        System.out.println("The dog is being fed.");
        if (hunger.getCurrentValue() > 0) {
            hunger.decrementValue();
        }
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    @Override
    public Attribute getPrimaryAttribute() {
        return happiness;
    }

    @Override
    public Attribute getSecondaryAttribute() {
        return hunger;
    }

    @Override
    public Color getColor() {
        return color;
    }

    private void writeObject(java.io.ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
    }
}
