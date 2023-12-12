import java.io.*;
import java.util.*;
import interfaces.Attribute;
import interfaces.Pet;
import pets.Cat;
import pets.Dog;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Owner owner = loadState();
        if (owner == null) {
            owner = new Owner();
        }
    
        System.out.println("Enter the name of your new pet:");
        String petName = scanner.nextLine();
        Pet newPet = choosePet();
        if (newPet != null) {
            owner.addPet(petName, newPet);
        }
    
        System.out.println("Which pet would you like to interact with?");
        owner.listPets();
        String selectedPetName = scanner.nextLine();
        Pet petToInteract = owner.getPet(selectedPetName);
        if (petToInteract != null) {
            interactWithPet(petToInteract);
            owner.showPetDetails(selectedPetName);  // Show details after interaction
        }
    
        saveState(owner);
    }    

    private static Pet choosePet() {
        System.out.println("Choose a Pet to interact with:");
        System.out.println("1- Cat");
        System.out.println("2- Dog");

        try {
            int petChoice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (petChoice) {
                case 1:
                    return new Cat();
                case 2:
                    return new Dog();
                default:
                    System.out.println("Invalid choice.");
                    return null;
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.nextLine(); // Consume the invalid input
            return null;
        }
    }

    private static void interactWithPet(Pet pet) {
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

            if (!processPetInteraction(pet, choice)) {
                break;
            }
        }
    }

    private static boolean processPetInteraction(Pet pet, int choice) {
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
                System.out.println("Hunger level: " + getAttributeValue(pet.getSecondaryAttribute()));
                break;
            case 6:
                System.out.println("Happiness level: " + getAttributeValue(pet.getPrimaryAttribute()));
                break;
            case 7:
                return false;
            default:
                System.out.println("Invalid choice. Please choose a valid option.");
                break;
        }
        return true;
    }

    private static String getAttributeValue(Attribute attribute) {
        return attribute.getValue(attribute.getCurrentValue());
    }
    
    private static void saveState(Owner owner) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("owner_state.ser"))) {
            out.writeObject(owner);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private static Owner loadState() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("owner_state.ser"))) {
            return (Owner) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No saved state found. Starting with a new owner.");
            return null;
        }
    }    
}