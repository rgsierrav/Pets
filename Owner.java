import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import interfaces.Pet;

public class Owner implements Serializable {
    private Map<String, Pet> pets;

    public Owner() {
        this.pets = new HashMap<>();
    }

    public void addPet(String name, Pet pet) {
        if (!pets.containsKey(name)) {
            pets.put(name, pet);
        } else {
            System.out.println("A pet with this name already exists.");
        }
    }
    
    public void removePet(String name) {
        if (pets.containsKey(name)) {
            pets.remove(name);
        } else {
            System.out.println("No pet found with this name.");
        }
    }
    
    public void showPetDetails(String name) {
        if (pets.containsKey(name)) {
            Pet pet = pets.get(name);
            System.out.println("Details for " + name + ":");
            System.out.println("Color: " + pet.getColor());
            System.out.println("Happiness Level: " + pet.getPrimaryAttribute().getCurrentValue());
            System.out.println("Hunger Level: " + pet.getSecondaryAttribute().getCurrentValue());
        } else {
            System.out.println("No pet found with this name.");
        }
    }    

    public Pet getPet(String name) {
        return pets.get(name);
    }

    public void listPets() {
        if (pets.isEmpty()) {
            System.out.println("You have no pets.");
        } else {
            System.out.println("Your pets:");
            for (String name : pets.keySet()) {
                System.out.println("- " + name);
            }
        }
    }
}
