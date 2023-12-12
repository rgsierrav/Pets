package pets;

import java.io.IOException;
import java.io.Serializable; // Import Serializable
import enums.Color;
import interfaces.Attribute;
import interfaces.Pet;
import attributes.HappinessAttribute;
import attributes.HungerAttribute;

public class Cat implements Pet, Serializable { // Implement Serializable
    private Attribute happiness;
    private Attribute hunger;
    private Color color;

    public Cat() {
        this.happiness = new HappinessAttribute();
        this.hunger = new HungerAttribute();
        this.color = Color.GRAY;
    }

    @Override
    public void play() {
        System.out.println("The cat is playing.");
        happiness.incrementValue();
        hunger.incrementValue();
    }

    @Override
    public void feed() {
        System.out.println("The cat is being fed.");
        if (hunger.getCurrentValue() > 0) {
            hunger.decrementValue();
        }
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
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
