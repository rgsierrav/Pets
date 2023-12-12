package attributes;

import interfaces.Attribute;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

public class HungerAttribute implements Attribute, Serializable {
    private int value;
    private static final Map<Integer, String> levelDescriptions = new HashMap<>();

    static {
        levelDescriptions.put(0, "Not Hungry");
        levelDescriptions.put(1, "A little Hungry");
        levelDescriptions.put(2, "Hungry");
        levelDescriptions.put(3, "Very Hungry");
        levelDescriptions.put(4, "Starving");
        levelDescriptions.put(5, "Feed Me");
    }

    public HungerAttribute() {
        this.value = 0; // Starting with not hungry
    }

    @Override
    public void incrementValue() {
        value++; // Increase hunger level
        // Optionally, you can cap the maximum value
    }

    @Override
    public void decrementValue() {
        if (value > 0) {
            value--; // Decrease hunger level
        }
    }

    @Override
    public String getValue(Integer key) {
        return levelDescriptions.getOrDefault(key, "Unknown");
    }

    @Override
    public Integer getCurrentValue() {
        return value;
    }

    // Implement serialization methods if necessary
    private void writeObject(java.io.ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
    }
}
