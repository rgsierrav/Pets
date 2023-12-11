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
        pets.put(name, pet);
    }

    public void removePet(String name) {
        pets.remove(name);
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

    // Additional methods as needed, e.g., to save/load pet states, etc.
}
