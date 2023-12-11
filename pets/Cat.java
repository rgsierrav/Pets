package pets;

import java.io.Serializable; // Import Serializable
import enums.Color;
import interfaces.Attribute;
import interfaces.Pet;

public class Cat implements Pet, Serializable { // Implement Serializable
    private int happiness;
    private int hunger;
    private Color color;

    public Cat() {
        this.happiness = 0;
        this.hunger = 0;
        this.color = Color.GRAY;
    }

    @Override
    public void play() {
        System.out.println("The cat is playing.");
        happiness++;
        hunger++;
    }

    @Override
    public void feed() {
        System.out.println("The cat is being fed.");
        hunger--;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
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
    
    // Implement serialization methods
    private void writeObject(java.io.ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
    }
}
