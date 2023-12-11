import java.io.*;
import java.util.*;
import enums.Color;
import interfaces.Attribute;
import interfaces.Pet;

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
        scanner.nextLine(); 

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
            scanner.nextLine(); 

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