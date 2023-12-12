package attributes;

import interfaces.Attribute;
import java.util.HashMap;
import java.util.Map;

public class HungerAttribute implements Attribute {
    private int value;
    private static final Map<Integer, String> levelDescriptions = new HashMap<>();

    static {
        levelDescriptions.put(0, "Not Hungry");
        levelDescriptions.put(1, "A little Hungry");
        levelDescriptions.put(2, "Hungry");
        levelDescriptions.put(3, "Very Hungry");
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
}
