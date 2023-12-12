package attributes;

import interfaces.Attribute;
import java.util.HashMap;
import java.util.Map;

public class HappinessAttribute implements Attribute {
    private int value;
    private static final Map<Integer, String> levelDescriptions = new HashMap<>();

    static {
        levelDescriptions.put(0, "Sad");
        levelDescriptions.put(1, "Happy");
        levelDescriptions.put(2, "Very Happy");
        // Add more levels as needed
    }

    public HappinessAttribute() {
        this.value = 0;
    }

    @Override
    public void incrementValue() {
        value++;
    }

    @Override
    public void decrementValue() {
        if (value > 0) {
            value--;
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
