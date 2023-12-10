import java.io.*;
import java.util.*;

// Enums
enum Color {
    RED,
    GREEN,
    BLUE,
    YELLOW,
    ORANGE,
    PURPLE,
    BROWN,
    GRAY,
    BLACK,
    WHITE
}

// Interfaces
interface Attribute {
    void incrementValue();
    void decrementValue();
    String getValue(Integer key);
    Integer getCurrentValue();
}

interface Pet {
    void play();
    void feed();
    void makeSound();
    Attribute getAttribute1();
    Attribute getAttribute2();
    Color getColor();
}

// Concrete Attribute Implementations
class HappinessAttribute implements Attribute {
    private int value;

    public HappinessAttribute() {
        // Initialize the value to a default value
        this.value = 0;
    }

    @Override
    public void incrementValue() {
        // Implement logic to increment the value
        value++;
    }

    @Override
    public void decrementValue() {
        // Implement logic to decrement the value
        if (value > 0) {
            value--;
        }
    }

    @Override
    public String getValue(Integer key) {
        // Implement logic to return a description based on 'key'
        // Replace this with your actual logic
        return "Custom description based on key";
    }

    @Override
    public Integer getCurrentValue() {
        return value;
    }
}

class HungerAttribute implements Attribute {
    private int value;

    public HungerAttribute() {
        // Initialize the value to a default value
        this.value = 0;
    }

    @Override
    public void incrementValue() {
        // Implement logic to increment the value
        value++;
    }

    @Override
    public void decrementValue() {
        // Implement logic to decrement the value
        if (value > 0) {
            value--;
        }
    }

    @Override
    public String getValue(Integer key) {
        // Implement logic to return a description based on 'key'
        // Replace this with your actual logic
        return "Custom description based on key";
    }

    @Override
    public Integer getCurrentValue() {
        return value;
    }
}

// Concrete Pet Implementations
class Cat implements Pet {
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
}

class Dog implements Pet {
    private int happiness;
    private int hunger;
    private Color color;

    public Dog() {
        this.happiness = 0;
        this.hunger = 0;
        this.color = Color.BROWN;
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

// Owner class
class Owner {
    // You can add owner-specific logic here
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a Pet to interact with:");
        System.out.println("1- Cat");
        System.out.println("2- Dog");

        int petChoice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Pet pet = null;

        if (petChoice == 1) {
            pet = new Cat();
        } else if (petChoice == 2) {
            pet = new Dog();
        } else {
            System.out.println("Invalid choice.");
            scanner.close();
            return;
        }

        while (true) {
            System.out.println("\nChoose from the following:");
            System.out.println("1- Play");
            System.out.println("2- Feed");
            System.out.println("3- Make sound");
            System.out.println("4- View color");
            System.out.println("5- View hunger value");
            System.out.println("6- View happiness value");
            System.out.println("7- Quit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    pet.play();
                    break;
                case 2:
                    pet.feed();
                    break;
                case 3:
                    pet.makeSound();
                    break;
                case 4:
                    System.out.println("Color: " + pet.getColor());
                    break;
                case 5:
                    Attribute attribute1 = pet.getAttribute1();
                    System.out.println("Hunger value: " + attribute1.getCurrentValue());
                    break;
                case 6:
                    Attribute attribute2 = pet.getAttribute2();
                    System.out.println("Happiness value: " + attribute2.getCurrentValue());
                    break;
                case 7:
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
                    break;
            }
        }
    }
}
