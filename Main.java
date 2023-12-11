import java.io.*;
import java.util.*;
import enums.Color;
import interfaces.Attribute;
import interfaces.Pet;

class Owner {
    // You can add owner-specific logic here
}

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Pet pet = choosePet();
        if (pet == null) {
            System.out.println("Exiting program.");
            return;
        }

        interactWithPet(pet);
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

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                if (!processPetInteraction(pet, choice)) {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Consume the invalid input
            }
        }
    }

    private static boolean processPetInteraction(Pet pet, int choice) {
        switch (choice) {
            case 1:
                pet.play();
                return true;
            case 2:
                pet.feed();
                return true;
            case 3:
                pet.makeSound();
                return true;
            case 4:
                System.out.println("Color: " + pet.getColor());
                return true;
            case 5:
                Attribute attribute1 = pet.getAttribute1();
                System.out.println("Hunger value: " + attribute1.getCurrentValue());
                return true;
            case 6:
                Attribute attribute2 = pet.getAttribute2();
                System.out.println("Happiness value: " + attribute2.getCurrentValue());
                return true;
            case 7:
                scanner.close();
                return false;
            default:
                System.out.println("Invalid choice. Please choose a valid option.");
                return true;
        }
    }
}
